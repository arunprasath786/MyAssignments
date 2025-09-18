package week3.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {
	public static ChromeDriver driver;
	
	public void browserLaunch() {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("guest");
    driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://leaftaps.com/opentaps/control/main");
	}
	public void findElement(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);
	}
	public void enterText() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	public void clickElement() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	public void performCommonTask() {
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.close();
	}
	public static void main(String[] args) {
		BasePage base = new BasePage();
		base.browserLaunch();
		base.findElement("demosalesmanager");
		base.enterText();
		base.clickElement();
		base.performCommonTask();
	}
}
