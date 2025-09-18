package week3.Day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioButtonWithList {

	public static void main(String[] args) {
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("Guest");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/radio.xhtml");
	driver.findElement(By.xpath("(//label[text() = 'Chrome'])[1]")).click();
	System.out.println("****************Browser Radio buttons*********************");
		List<WebElement> browser = driver.findElements(By.xpath("//input[@name='j_idt87:console1']"));
		for (WebElement webElement : browser) {
			boolean selected = webElement.isSelected();
			//String text = webElement.getText();
			System.out.println("Selected browser is :"  + selected);
		}
		System.out.println("****************Default Radio buttons*********************");
		List<WebElement> defaultButton = driver.findElements(By.xpath("//input[@name='j_idt87:console2']"));
		for (WebElement webElement1 : defaultButton) {
			boolean selected = webElement1.isSelected();
			//String text1 = webElement1.getText();
			
			System.out.println("Selected default button is :"  + selected);
		}
		System.out.println("****************Age Radio buttons*********************");
		List<WebElement> age = driver.findElements(By.xpath("//input[@name='j_idt87:age']"));
		for (WebElement webElement2 : age) {
			boolean selected = webElement2.isSelected();
			//String text1 = webElement1.getText();
			
			System.out.println("Selected Age button is :"  + selected);
		}


	}

}
