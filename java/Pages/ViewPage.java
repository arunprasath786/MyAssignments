package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.ProjectBase;

public class ViewPage extends ProjectBase{
	
	
	public ViewPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public ViewPage VerifyTileOfPage() {
		String title = driver.getTitle();
		System.out.println(title);
		String expectedTitle = "View Lead | opentaps CRM";
		if(title.equals(expectedTitle)) {
			System.out.println("Title is verified successfully");
		}
        return this;
	}
}
