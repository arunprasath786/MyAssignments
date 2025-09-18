package week3.Day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnAlerts {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("Guest");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com");
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//i[@class='pi pi-fw pi-clone layout-menuitem-icon']")).click();
		
		//Alert Simple Dialog
		System.out.println("*************Alert(simple dialog)************");
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		Alert alert = driver.switchTo().alert();
		String Simpletext = alert.getText();
		alert.accept();
		System.out.println("Alert text:" + " " + Simpletext);
		System.out.println("Alert handled successfully:" + " " +driver.findElement(By.xpath("//span[@id='simple_result']")).getText());
		
		//Alert(confirm dialog)
		System.out.println("*************Alert(confirm dialog)************");
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		Alert alert1 = driver.switchTo().alert();
		String confirmText = alert1.getText();
		alert.dismiss();
		System.out.println("Alert text:" + " " + confirmText);
		System.out.println("Alert handled successfully:" + " " +driver.findElement(By.xpath("//span[@id='result']")).getText());
		
		//Alert prompt dialog
		System.out.println("*************Alert(prompt dialog)************");
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("prompt for user name");
		String promptText = alert2.getText();
		alert.accept();
		System.out.println("Alert text:" + " " + promptText);
		System.out.println("Alert handled successfully:" + " " +driver.findElement(By.xpath("//span[@id='confirm_result']")).getText());
		
		//sweet alert simple
		System.out.println("*************Alert(sweet simple)************");
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		String sweetSimpletext = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[1]/p")).getText();
		System.out.println("Alert text:" + " " + sweetSimpletext);
		driver.findElement(By.xpath("(//span[text()='Dismiss'])")).click();
		
		//sweet modal dialog
		System.out.println("*************Alert(sweet modal)************");
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).click();
		String sweetModaltext = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[2]/p")).getText();
		System.out.println("Alert text:" + " " + sweetModaltext);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		
		//sweet confirm 
		System.out.println("*************Alert(sweet confirm)************");
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[7]")).click();
		String sweetConfirmtext = driver.findElement(By.xpath("//span[@class='ui-confirm-dialog-message']")).getText();
		System.out.println("Alert text:" + " " + sweetConfirmtext);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		
		//minimize & maximize
		System.out.println("*************Alert(sweet confirm)************");
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[8]")).click();
		String minMaxtext = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[3]/p")).getText();
		System.out.println("Alert text:" + " " + minMaxtext);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-minimize ui-corner-all']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-maximize ui-corner-all']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
		driver.close();
		
		

	}

}
