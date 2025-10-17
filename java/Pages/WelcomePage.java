package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.ProjectBase;

public class WelcomePage extends ProjectBase{
	
	
	public WelcomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public MyHomePage CLickCrmsfa() {
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		return new MyHomePage(driver);

	}

}
