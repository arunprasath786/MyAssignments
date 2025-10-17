package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.ProjectBase;

public class MyHomePage extends ProjectBase{
	
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateLeadPage ClickCreateLeadShortcuts() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);

	}

}
