package week2.Day4;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountAssignment {

	public static void main(String[] args) {
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
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("currentAcc");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		WebElement IndustryDropDown = driver.findElement(By.name("industryEnumId"));
		Select Options = new Select(IndustryDropDown);
		Options.selectByVisibleText("Computer Software");
		WebElement OwnershipDropDown = driver.findElement(By.name("ownershipEnumId"));
		Select Options1 = new Select(OwnershipDropDown);
		Options1.selectByVisibleText("S-Corporation");
		WebElement SourceDropDown = driver.findElement(By.id("dataSourceId"));
		Select Options2 = new Select(SourceDropDown);
		Options2.selectByValue("LEAD_EMPLOYEE");
		WebElement MarketingDropDown = driver.findElement(By.id("marketingCampaignId"));
		Select Options3 = new Select(MarketingDropDown);
		Options3.selectByIndex(6);
		WebElement StateProvinceDrop = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select Options4 = new Select(StateProvinceDrop);
		Options4.selectByValue("TX");
		driver.findElement(By.xpath("//input[@value = 'Create Account']")).click();
		String AccountName = driver.findElement(By.xpath("(//span[@class = 'tabletext'])[3]")).getText();
		if(AccountName.contains("currentAcc")) {
			System.out.println("Account Name is displayed correctly");
		}
		driver.close();
	}

}
