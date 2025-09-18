package week3.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBoxAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("Guest");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		boolean displayed = driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed();
		System.out.println(displayed);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		boolean displayed1 = driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed();
		System.out.println(displayed1);
		Thread.sleep(10000);
		boolean enabled = driver.findElement(By.xpath("//span[text()='Disabled']/parent::div")).isEnabled();
		System.out.println("Webelement is enabled:"+ enabled);
		driver.findElement(By.xpath("//ul[@data-label = 'Cities']")).click();
		driver.findElement(By.xpath("(//label[text()= 'Miami'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()= 'Berlin'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()= 'Amsterdam'])[2]")).click();
		driver.close();
		
		
		

	}

}
