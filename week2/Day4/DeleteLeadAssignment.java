package week2.Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLeadAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()= 'Phone']")).click();
		driver.findElement(By.xpath("//input[@name= 'phoneNumber']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();
		String result = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if(result.equals("No records to display")) {
			System.out.println("Lead is deleted successfully");
		}
		WebElement element = driver.findElement(By.xpath("//div[text()='No records to display']"));
		boolean display = element.isDisplayed();
		System.out.println("Deleted successfully:" +display);
		driver.close();

	}

}
