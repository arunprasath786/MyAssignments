package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.ProjectBase;

public class CreateLeadPage extends ProjectBase{
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateLeadPage enterCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		return this;
	}
	public CreateLeadPage enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		return this;
	}
	public CreateLeadPage enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
    }
	public CreateLeadPage enterTitle(String title) {
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(title);
        return this;
	}
	public ViewPage clickCreateLeadButton() {
		driver.findElement(By.xpath("//input[@value = 'Create Lead']")).click();
        return new ViewPage(driver);
	}

}
