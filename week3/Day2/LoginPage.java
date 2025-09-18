package week3.Day2;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

	public void findElement(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	public static void main(String[] args) {
		LoginPage login = new LoginPage();
		login.browserLaunch();
		login.findElement("demosalesmanager");
		login.clickElement();
		login.performCommonTask();

	}

}
