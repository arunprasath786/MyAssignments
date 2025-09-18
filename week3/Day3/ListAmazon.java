package week3.Day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ListAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
	    ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> findElements = driver.findElements(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-line-clamp-3-for-col-12 s-link-style a-text-normal']"));
		for (WebElement phoneName : findElements) {
			String nameText = phoneName.getText();
			System.out.println(nameText);
		}
		Thread.sleep(3000);
		List<WebElement> phonePrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		ArrayList<Integer> numlist = new ArrayList<Integer>();
		
		for (WebElement values : phonePrice) {
			String textPrice = values.getText().replace("," , "");
			if(!textPrice.isEmpty()) {
				int price = Integer.parseInt(textPrice);
				System.out.println(price);
				numlist.add(price);
			}
			
			
		}
		Collections.sort(numlist);
		System.out.println(numlist);
		System.out.println("Lowest price is:" + numlist.get(0));
		driver.close();
		
	}
	

}
