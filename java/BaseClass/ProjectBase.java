package BaseClass;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import week6.Day1.ReadExcel;

public class ProjectBase {
	
	public  ChromeDriver driver;
	public String fileName;
	
	@BeforeMethod
	public void preCondition() {
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("Guest");
		driver=new ChromeDriver(Options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	@AfterMethod
    public void postCondition() {
		driver.close();
	}
	
	
	@DataProvider(name = "fetchData")
	public  String[][] sendData() throws IOException {
		return ReadExcel1.readData(fileName);
		
		

	}	

}
