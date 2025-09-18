package week3.Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioButtonAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("Guest");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/radio.xhtml");
		WebElement chromeBrowser = driver.findElement(By.xpath("(//label[text() = 'Chrome'])[1]"));
		boolean displayed = chromeBrowser.isDisplayed();
		System.out.println("Chrome browser is displayed:" + displayed);
		//chromeBrowser.click();
		//driver.findElement(By.xpath("(//label[text() = 'Chrome'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget']/div/span)[12]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget']/div/span)[12]")).click();
		Thread.sleep(2000);
		boolean selected = driver.findElement(By.xpath("//input[@id='j_idt87:console1:0']")).isSelected();
		System.out.println("Radio button is selected:" +selected);
		if(!selected) {
			System.out.println("Radio button is unselected");
		}
		else {
			System.out.println("Radio button is selected");
		}
		Thread.sleep(2000);
		boolean browser2 = driver.findElement(By.xpath("//input[@id='j_idt87:console1:1']")).isSelected();
		if(!browser2) {
			System.out.println("Radio button not selected by default");
		}
		else {
			System.out.println("Radio button selected by default");
		}
		Thread.sleep(2000);
		boolean browser3 = driver.findElement(By.xpath("//input[@id='j_idt87:console1:2']")).isSelected();
		if(!browser2) {
			System.out.println("Radio button not selected by default");
		}
		else {
			System.out.println("Radio button selected by default");
		}
		Thread.sleep(2000);
		boolean browser4 = driver.findElement(By.xpath("//input[@id='j_idt87:console1:3']")).isSelected();
		if(!browser4) {
			System.out.println("Radio button not selected by default");
		}
		else {
			System.out.println("Radio button selected by default");
		}
		Thread.sleep(2000);
		boolean default1 = driver.findElement(By.xpath("//input[@id='j_idt87:console2:0']")).isSelected();
		if(!default1) {
			System.out.println("Radio button not selected by default");
		}
		else {
			System.out.println("Radio button selected by default");
		}
		Thread.sleep(2000);
		boolean default2 = driver.findElement(By.xpath("//input[@id='j_idt87:console2:1']")).isSelected();
		if(!default2) {
			System.out.println("Radio button not selected by default");
		}
		else {
			System.out.println("Radio button selected by default");
		}
		Thread.sleep(2000);
		boolean default3 = driver.findElement(By.xpath("//input[@id='j_idt87:console2:2']")).isSelected();
		if(!default3) {
			System.out.println("Radio button is unselected");
		}
		else {
			System.out.println("Radio button is selected by default");
		Thread.sleep(2000);
		boolean default4 = driver.findElement(By.xpath("//input[@id='j_idt87:console2:3']")).isSelected();
		if(!default4) {
			System.out.println("Radio button not selected by default");
		}
		else {
			System.out.println("Radio button selected by default");
		}
		Thread.sleep(2000);
		boolean age1 = driver.findElement(By.xpath("//input[@id='j_idt87:age:0']")).isSelected();
		if(!age1) {
			System.out.println("Radio button not selected by default");
		}
		else {
			System.out.println("Radio button selected by default");
		}
		Thread.sleep(2000);
		boolean age2 = driver.findElement(By.xpath("//input[@id='j_idt87:age:1']")).isSelected();
		if(!age2) {
			
			System.out.println("Radio button not selected by default");
		}
		else {
			System.out.println("Radio button selected by default");
			System.out.println("Age group 21-40 years radio button is selected");
		}
		Thread.sleep(2000);
		boolean age3 = driver.findElement(By.xpath("//input[@id='j_idt87:age:2']")).isSelected();
		if(!age3) {
			System.out.println("Radio button not selected by default");
			
		}
		else {
			System.out.println("Radio button selected by default");
		}
				driver.close();
	}

	}
}


