package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.ProjectBase;
import Pages.LoginPage;


public class CreateLeadTC01 extends ProjectBase{
	
	@BeforeTest
	public void setData() {
		fileName= "CreateleadData";
	}
	
	@Test(dataProvider = "fetchData")
	public void createLead(String companyName, String firstName, String lastName, String title) {
		//,
    	 LoginPage lp = new LoginPage(driver);
    	 lp.enterUsername("demosalesmanager")
    	 .enterPassword("crmsfa")
    	 .clickLoginButton()
    	 .CLickCrmsfa()
    	 .ClickCreateLeadShortcuts()
    	 .enterCompanyName(companyName)
    	 .enterFirstName(firstName)
    	 .enterLastName(lastName)
    	 .enterTitle(title)
    	 .clickCreateLeadButton()
    	 .VerifyTileOfPage();
    
	}
}
