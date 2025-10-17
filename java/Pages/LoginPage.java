package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.ProjectBase;



public class LoginPage extends ProjectBase {
	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage enterUsername(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);
		return this;
	}
    public LoginPage enterPassword(String passWord) {
    	driver.findElement(By.id("password")).sendKeys(passWord);
    	return this;
	}
    public WelcomePage clickLoginButton() {
    	driver.findElement(By.className("decorativeSubmit")).click();
    	return new WelcomePage(driver);
}

}
