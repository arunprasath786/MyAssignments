package week2.Day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLeadAssignment {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys("ISC Global Solutions Pvt Ltd.");
		driver.findElement(By.xpath("(//input[@name = 'firstName'])[3]")).sendKeys("Arun");
		driver.findElement(By.xpath("(//input[contains(@name, 'last')])[3]")).sendKeys("Prasath");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstNameLocal']")).sendKeys("Arun Prasath S");
		driver.findElement(By.xpath("//input[@name = 'departmentName']")).sendKeys("QA");
		driver.findElement(By.xpath("//textarea[@id = 'createLeadForm_description']")).sendKeys("Welcome to QA Selenium Automation");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_primaryEmail']")).sendKeys("arun@gmail.com");
		Thread.sleep(2000);
		WebElement StateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select Options = new Select(StateProvince);
        Options.selectByVisibleText("New York");
        List<WebElement> listState = Options.getOptions();
        for(WebElement State:listState) {
        	System.out.println(State.getText());
        }
        driver.findElement(By.xpath("//input[@value = 'Create Lead']")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.id("updateLeadForm_description")).clear();
        driver.findElement(By.xpath("//textarea[@id = 'updateLeadForm_importantNote']")).sendKeys("Updated note for leads");
        driver.findElement(By.xpath("//input[@value = 'Update']")).click();
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
        
	}

}
