package Week5.Day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {
	ChromeDriver driver;
	@Parameters({"url","userName","passWord"})
	@BeforeMethod
	public void PreConditions(String url,String userName,String passWord) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(passWord);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
	}
	@AfterMethod
    public void PostConditions() {
		driver.close();
	}

}
