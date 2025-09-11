package week2.Day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnSelectDropdown {

	
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		driver.findElement(By.xpath("//input[@value = 'Create Lead']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String expectedTitle = "View Lead | opentaps CRM";
		if(title.equals(expectedTitle)) {
			System.out.println("Title is verified successfully");
			driver.quit();
		}
		
		

	}

}
