package week3.Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser extends Chrome{
	
	public static void main(String[] args) {
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("Guest");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		Browser baseClass = new Browser();
		baseClass.openURL();
		baseClass.closeBrowser("Chrome", 120.030f);
		baseClass.navigateBack();
		
		Chrome chromeSubClass = new Chrome();
		chromeSubClass.openIncognito();
		chromeSubClass.clearCache();
		
	}
	
	
	

}
