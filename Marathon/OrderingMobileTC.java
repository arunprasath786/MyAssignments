package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class OrderingMobileTC {

	public static void main(String[] args) {
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("guest");
		Options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://dev194776.service-now.com/");
		Actions actions = new Actions(driver);
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("mZE@l60wP%iO");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		Shadow sha = new Shadow(driver);
		sha.setImplicitWait(20);
		sha.findElementByXPath("//div[@class='sn-polaris-tab can-animate polaris-enabled']").click();
		sha.findElementByXPath("//span[text()='Service Catalog']").click();
		actions.scrollToElement(driver.findElement(By.xpath("//a[@aria-label = 'Mobiles. Cell phones to meet your business needs.']/h2"))).perform();
		driver.findElement(By.xpath("//a[@aria-label = 'Mobiles. Cell phones to meet your business needs.']/h2")).click();
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13']")).click();
		driver.findElement(By.xpath("(//label[@class='radio-label'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']")).sendKeys("99");
		driver.findElement(By.xpath("(//div[@class='col-xs-6  form-field input_controls sc-form-field '])[3]")).click();
		driver.findElement(By.xpath("//option[text()='Unlimited [add $4.00]']")).click();
		driver.findElement(By.xpath("(//label[@class='radio-label'])[5]")).click();
		driver.findElement(By.xpath("(//label[@class='radio-label'])[11]")).click();
		driver.findElement(By.xpath("//button[text()='Order Now']")).click();
		String text = driver.findElement(By.xpath("//span[text()='Thank you, your request has been submitted']")).getText();
		System.out.println("Order Status" + text);
		String CheckoutSum = driver.findElement(By.xpath("//td[@class='checkoutTotalSum']")).getText();
		System.out.println("Checkout Total:" + CheckoutSum);
		
		
		

	}

}
