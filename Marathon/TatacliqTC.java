package Marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.utils.FileUtil;

public class TatacliqTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("guest");
		Options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.tatacliq.com/");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]"))).perform();
		actions.moveToElement(driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryDetailsValue'])[4]"))).perform();
		actions.click(driver.findElement(By.xpath("(//div[@class='DesktopHeader__brandsDetails'])[1]"))).perform();
		//WebElement findElement = driver.findElement(By.className("SelectBoxDesktop__base"));
	    driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']")).click();
		driver.findElement(By.xpath("//option[text()='New Arrivals']")).click();
		driver.findElement(By.xpath("(//div[@class='FilterDesktop__newFilCheckbox']/div)[1]")).click();
		Thread.sleep(3000);
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='ProductDescription__content']/div/h3"));
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (WebElement string1 : findElements) {
			//String price2= string1.replaceAll("[^0-9]", "");
			System.out.println(string1.getText().replaceAll("[^0-9]", ""));
			String price = string1.getText().replaceAll("[^0-9]", "");
			//System.out.println(price);
			if(!price.isEmpty()) {
				int intPrice = Integer.parseInt(price);
				list.add(intPrice);
			}
		}
		System.out.println(list);
		driver.findElement(By.xpath("(//a[@class='ProductModule__base'])[1]")).click();
		String firstResultText = driver.findElement(By.xpath("(//div[@class='ProductDescription__content']/div/h3)[1]")).getText();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		String parent = windows.get(0);
		String child = windows.get(1);
		driver.switchTo().window(child);
		String detailPageText = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText();
		if(detailPageText.contains(firstResultText)) {
			System.out.println("Price is same");
		}
		else {
			System.out.println("price is different");
		}
		driver.findElement(By.xpath("(//div[@class='Button__base']/span)[3]")).click();
		Thread.sleep(2000);
		String bagCount = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("Cart count:" + bagCount);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		File src = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("D:/eclipse/Selenium/snap/CartPage.png");
		FileUtils.copyFile(src, target);
		driver.close();
		driver.switchTo().window(parent);
		driver.close();

	}

}
