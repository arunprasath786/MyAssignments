package Implementation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseClass{
	
@Given("load URL.")
public void load_url() {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("guest");
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://leaftaps.com/opentaps/control/main");
    }

@Given("Give the user name {string}")
public void give_the_user_name_demosalesmanager(String userName) {
	driver.findElement(By.id("username")).sendKeys(userName);
}

@Given("Give password {string}")
public void give_password_crmsfa(String passWord) {
	driver.findElement(By.id("password")).sendKeys(passWord);
}

@When("Click login button.")
public void click_login_button() {
	driver.findElement(By.className("decorativeSubmit")).click();
   }

@Then("Verify whether logged in.")
public void verify_whether_logged_in() {
    System.out.println("Loggedin successfully");
    
}
@Then("click crmsfa link")
public void click_crmsfa_link() {
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
}
@Given("Click create lead tab.")
public void click_create_lead_tab() {
	driver.findElement(By.linkText("Create Lead")).click();
}
@Given("Enter the company (.*)$")
public void enter_the_company_name(String companyName) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
}
@Given("Enter the first (.*)$")
public void enter_the_first_name(String firstName) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
    }
@Given("Enter the last (.*)$")
public void enter_the_last_name(String lastName) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
}
@Given("Enter the title (.*)$")
public void enter_the_title(String title) {
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(title);
}
    
@Given("Fill the create lead form details.")
public void fill_the_create_lead_form_details() throws InterruptedException {
	
	
	Thread.sleep(2000);
	WebElement SourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select Options = new Select(SourceDropDown);
	Options.selectByIndex(4);
	List<WebElement> list = Options.getOptions();
	list.size();
	for(WebElement result:list) {
		System.out.println(result.getText());
	}
	System.out.println(list.size());
	Thread.sleep(2000);
	WebElement MarketingDropDown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select Options1 = new Select(MarketingDropDown);
	Options1.selectByVisibleText("Automobile");
	Thread.sleep(2000);
	WebElement OwnershipDropDown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select Options2 = new Select(OwnershipDropDown);
	Options2.selectByValue("OWN_CCORP");
}
@Then("click create lead button.")
public void click_create_lead_button() {
	driver.findElement(By.xpath("//input[@value = 'Create Lead']")).click();
}
@Then("verify the title of the page.")
public void verify_the_title_of_the_page() {
	String title = driver.getTitle();
	System.out.println(title);
	String expectedTitle = "View Lead | opentaps CRM";
	if(title.equals(expectedTitle)) {
		System.out.println("Title is verified successfully");
		
}
	driver.close();
}
@Given("Click Account tab.")
public void click_account_tab() {
	driver.findElement(By.linkText("Accounts")).click();
}
@Given("Fill the create Account form details.")
public void fill_the_create_account_form_details() {
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.id("accountName")).sendKeys("current");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
	driver.findElement(By.id("numberEmployees")).sendKeys("80");
	driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	}
@Then("click create Account button.")
public void click_create_account_button() throws InterruptedException {
	driver.findElement(By.xpath("//input[@value = 'Create Account']")).click();
	Thread.sleep(10000);

}
@Then("verify Account and title of the page.")
public void verify_account_and_title_of_the_page() {
	String title = driver.getTitle();
	System.out.println(title);
	String AccountTitle = "Account Details | opentaps CRM";
	if(title.equals(AccountTitle)) {
		System.out.println("Title is verified successfully");
	}
	driver.close();
}
}
