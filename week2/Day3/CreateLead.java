package week2.Day3;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class CreateLead {

	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Google");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arun");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prasath");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Welcome To Google");
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
			driver.close();
		}
		
		

	}

}
