package Week5.Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnTestNG extends ProjectSpecificMethods{
	@DataProvider(name = "fetchData")
	public String[][] SendData() {
		String[][] dymamicData = new String[3][4];
		dymamicData[0][0]="Google";
		dymamicData[0][1]="Arun";
		dymamicData[0][2]="Prasath";
		dymamicData[0][3]="Welcome To Google";
		
		dymamicData[1][0]="TCS";
		dymamicData[1][1]="Arun";
		dymamicData[1][2]="Prasath";
		dymamicData[1][3]="Welcome To TCS";
		
		dymamicData[2][0]="CTS";
		dymamicData[2][1]="Arun";
		dymamicData[2][2]="Prasath";
		dymamicData[2][3]="Welcome To CTS";
		
		return dymamicData;
	}
	
	@Test(dataProvider = "fetchData")
	public void CreateLead(String company,String firstName,String lastName,String profileTitle) throws InterruptedException {
	
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(profileTitle);
		Thread.sleep(2000);
		WebElement SourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select Options = new Select(SourceDropDown);
		Options.selectByIndex(4);
		List<WebElement> list = Options.getOptions();
		list.size();
		for(WebElement result:list) {
			System.out.println(result.getText());
		}
		System.out.println(list.size());
		Thread.sleep(2000);
		WebElement MarketingDropDown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select Options1 = new Select(MarketingDropDown);
		Options1.selectByVisibleText("Automobile");
		Thread.sleep(2000);
		WebElement OwnershipDropDown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select Options2 = new Select(OwnershipDropDown);
		Options2.selectByValue("OWN_CCORP");
		driver.findElement(By.xpath("//input[@value = 'Create Lead']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String expectedTitle = "View Lead | opentaps CRM";
		if(title.equals(expectedTitle)) {
			System.out.println("Title is verified successfully");
			
		}
		
		}
}