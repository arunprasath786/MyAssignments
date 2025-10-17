package salesForceMarathon;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week6.Day1.ReadExcel;

public class EditOpprtunity extends BaseClass {
	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		String[][]  read= SalesForceReadExcel.readData();
		return read;

	}	
	@Test(dataProvider = "fetchData")
	public  void editOpportunity(String username,String password) throws InterruptedException {

		
		// Enter Username & Password
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		// Click Login
		driver.findElement(By.xpath("//input[@id='Login']")).click();

		// Click on toggle menu button
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

		// Click view All
		driver.findElement(By.xpath("//button[text()='View All']")).click();

		// Click Sales from App Launcher
		driver.findElement(By.xpath("//p[text()='Sales']")).click();

		// Click on Opportunity tab
		WebElement opportunities = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
		driver.executeScript("arguments[0].click();", opportunities);
		Thread.sleep(4000);

		//driver.findElement(By.xpath("//div[contains(@class,'test-listviewdisplayswitcher')]")).click();
	//	driver.findElement(By.xpath("//li[@title='Kanban']")).click();

		// 5. Search the Opportunity 'Salesforce Automation by *Your Name*'
		WebElement oppName = driver.findElement(By.xpath("//label[text()='Search this list...']//following::input[1]"));
		oppName.sendKeys("RamkumarRamaiah");
		Thread.sleep(2000);
		oppName.sendKeys(Keys.ENTER);

		// ,Keys.ENTER);

		// 6. Click on the Dropdown icon and Select Edit
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//lightning-button-menu[@class='slds-dropdown-trigger slds-dropdown-trigger_click'])[3]")).click();

		WebElement edit = driver.findElement(By.xpath("(//div[text()='Edit'])[1]"));
		driver.executeScript("arguments[0].click();", edit);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Close Date']/following::input[1]")).clear();
		driver.findElement(By.xpath("//label[text()='Close Date']/following::input[1]")).sendKeys("10/11/2025");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='slds-form-element__label']/following::lightning-base-combobox[4])[1]")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='Perception Analysis']")).click();
		//driver.findElement(By.xpath("(//label[@class='slds-form-element__label']/following::lightning-base-combobox[4])[1]")).sendKeys(Keys.ESCAPE);
		
		
WebElement element = driver.findElement(By.xpath("(//lightning-base-combobox[@class='slds-combobox_container'])[7]"));
		

		//Actions delivery = new Actions(driver);
		//delivery.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
		element.sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("//label[text()='Delivery/Installation Status']/following::lightning-base-combobox")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
       
		driver.findElement(By.xpath("(//span[text()='In progress'])[1]")).click();

		Thread.sleep(3000);
		driver.executeScript("document.body.style.zoom='80%'", "");
		driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("Salesforce");

		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();

		WebElement verify = driver.findElement(By.xpath("(//span[@class='slds-grid slds-grid_align-spread'])[5]/div"));

		System.out.println(verify.getText());

	}

}
