package Marathon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC01MovieTicketBooking {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("guest");
		options.addArguments("--disable-notifications"); 
	    ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Load URL & movie details
		driver.get("https://www.pvrcinemas.com");
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		driver.findElement(By.xpath("(//span[text()='JOLLY LLB 3'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='12:25 PM']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Submit']/span")).click();
		//Terms & conditions
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='sc-dFVmKS YKWSW reject-terms']")).click();
		driver.findElement(By.xpath("(//span[@class='seat-current-pvr'])[30]")).click();
		//seat info
		String seatInfo = driver.findElement(By.xpath("//div[@class='seat-info']")).getText();
		System.out.println("Seat info for the booked ticket:" + seatInfo);
		//Grand total
		String price = driver.findElement(By.xpath("//div[@class='grand-prices']")).getText();
		System.out.println("Grand total of booked ticket:" + price);
		//proceed to book
		driver.findElement(By.xpath("//button[@class='sc-eVqvcJ gITaIu btn-proceeded']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text() = 'Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		System.out.println("Movie ticket booked successfully");
		String titleOfPage = driver.getTitle();
		System.out.println("Title of the page is:" +titleOfPage);
	}

}
