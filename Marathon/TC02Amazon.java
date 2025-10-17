package Marathon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TC02Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
	    ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		String totalResults = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
        System.out.println(" Search results are:" + totalResults);
        driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[5]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[6]")).click();
        WebElement sortSelect = driver.findElement(By.id("s-result-sort-select"));
        Select Options = new Select(sortSelect);
        Options.selectByVisibleText("Newest Arrivals");
        String firstSortResult = driver.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-2 s-line-clamp-3-for-col-12 s-link-style a-text-normal'])[1]")).getText();
        System.out.println("First sort results text:" + firstSortResult);
        //driver.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-2 s-line-clamp-3-for-col-12 s-link-style a-text-normal'])[1]")).click();
        String pricetext = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[3]")).getText();
        System.out.println("First result name,price :" + firstSortResult + " ," + pricetext);
        String pageTitle = driver.getTitle();
        System.out.println("Title of the webpage:" + pageTitle);
        Thread.sleep(2000);
        driver.close();
        
	}

}
