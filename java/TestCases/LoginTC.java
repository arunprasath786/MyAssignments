package TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.ProjectBase;
import Pages.LoginPage;

public class LoginTC extends ProjectBase {
	
	@BeforeTest
	public void setData() {
		fileName= "LeafTapsLogin";
	}

	@Test(dataProvider = "fetchData")
	public void LeaftapLogin(String userName,String passWord) {
		 LoginPage lp = new LoginPage(driver);
    	 lp.enterUsername(userName)
    	 .enterPassword(passWord)
    	 .clickLoginButton();
	}
}
