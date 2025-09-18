package week3.Day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFrames {

	public static void main(String[] args) {
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("Guest");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com");
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//i[@class='pi pi-fw pi-stop layout-menuitem-icon']")).click();
		
		//Click me inside frame
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		String frameText = driver.findElement(By.xpath("//button[@id='Click']")).getText();
		System.out.println("Text of click me button after click:" + frameText);
		driver.switchTo().defaultContent();
		
		//Count frames
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='nested.xhtml']")));
		String countText = driver.findElement(By.xpath("//button[@id='Click']")).getText();
		System.out.println("Text for button:" + countText);
		driver.switchTo().defaultContent();
		
		//nested frames
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src = 'page.xhtml']")));
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		String nestedFrameText = driver.findElement(By.xpath("//button[@id='Click']")).getText();
		System.out.println("Text of click me button after click:" + nestedFrameText);
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		driver.close();
		
		
		
		
		

	}

}
