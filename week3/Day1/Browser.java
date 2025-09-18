package week3.Day1;

import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
String browserName;
float browserVersion;

public void openURL() {
	System.out.println("http://leaftaps.com/opentaps/control/main");
}

public void closeBrowser(String browserName, float browserVersion) {
	System.out.println("Close browser:" + browserName + "," +browserVersion);
}
public void navigateBack() {
	System.out.println("Navigate bckt to mentioned test URL:");
}


}
