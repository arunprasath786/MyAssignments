package Week5.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnTestNGXML {
	@Parameters({"url","userName","passWord"})
	@Test
public void LoadUrl(String url,String userName,String passWord) {
	/*ChromeOptions options = new ChromeOptions();
	options.addArguments("guest");
	ChromeDriver driver = new ChromeDriver(options);
	*/
		EdgeOptions options = new EdgeOptions();
		options.addArguments("guest");
		RemoteWebDriver driver;
		driver = new EdgeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(userName);
	driver.findElement(By.id("password")).sendKeys(passWord);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.close();
}
}
