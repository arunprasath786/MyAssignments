package salesForceMarathon;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week6.Day1.ReadExcel;

public class CreateNewOpportunity extends BaseClass{
	
	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		String[][]  read= SalesForceReadExcel.readData();
		return read;

	}	
	
@Test(dataProvider = "fetchData")
	public  void CreateOpportunity(String username,String password) throws InterruptedException {

// Disable Notification		
		

// Enter Username & Password
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
// Click Login
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		//driver.findElement(By.linkText("I Don't Want to Register My Phone")).click();

// Click on toggle menu button
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(2000);
//  Click view All
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(2000);
//  Click Sales from App Launcher		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();

// Click on Opportunity tab 		
		WebElement opportunities = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
		driver.executeScript("arguments[0].click();", opportunities);

// Click on New button
		driver.findElement(By.xpath("//div[text()='New']")).click();

// Enter Opportunity name & Store it
		WebElement oppName = driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input[1]"));
		oppName.sendKeys("RamkumarRamaiah");

// Choose close date as Today
		driver.findElement(By.xpath("//label[text()='Close Date']/following::input[1]")).sendKeys("10/10/2025");
		//driver.findElement(By.xpath("//table[@class='slds-datepicker__month']//tr[3]/td[7]")).click();
		// driver.findElement(By.xpath("//label[text()='Close
		// Date']/following::input[1]")).sendKeys("{{today}}");
// Select 'Stage' as Need Analysis
		
		//driver.findElement(By.xpath("//button[@id='combobox-button-291']")).click();
		
		//driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[@id='combobox-button-291']")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("//label[text()='Stage']/following::input")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		

// click Save
		driver.findElement(By.xpath("(//button[@class='slds-button slds-button_brand'])[3]")).click();

// VerifyOppurtunity Name		
		String verifymsg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]/a"))
				.getAttribute("title");

		if (verifymsg.contains("Ramkumar")) {
			System.out.println("New Oppurtunity Created");
		} else {
			System.out.println("Oppurtunity not Created");
		}
	}
}
