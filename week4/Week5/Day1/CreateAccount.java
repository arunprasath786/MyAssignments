package Week5.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CreateAccount extends ProjectSpecificMethods{
@Test
	public  void CreateAccount1() throws InterruptedException {
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("current");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.id("numberEmployees")).sendKeys("80");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.xpath("//input[@value = 'Create Account']")).click();
		Thread.sleep(10000);
		String title = driver.getTitle();
		System.out.println(title);
		String AccountTitle = "Account Details | opentaps CRM";
		if(title.equals(AccountTitle)) {
			System.out.println("Title is verified successfully");
		}
		

	}

}
