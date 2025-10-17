package Marathon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC03TataCliq {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("guest");
		Options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tatacliq.com/");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]"))).perform();
		actions.moveToElement(driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryDetailsValue'])[4]"))).perform();
		actions.click(driver.findElement(By.xpath("(//div[@class='DesktopHeader__brandsDetails'])[1]"))).perform();
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.className("SelectBoxDesktop__base"));
		//WebElement dropDown = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select Options1 = new Select(findElement);
		Options1.selectByVisibleText("New Arrivals");
		driver.findElement(By.xpath("(//div[@class='FilterDesktop__newFilCheckbox']/div)[1]")).click();
		List<WebElement> watchPriceList = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (WebElement string : watchPriceList) {
			String price = string.getText().replace("₹", "");
			if(!price.isEmpty()) {
				int intPrice = Integer.parseInt(price);
				list.add(intPrice);
			}
		}
		System.out.println("Price of result watches:" +list);
		

	}

}
