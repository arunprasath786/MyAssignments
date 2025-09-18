package week3.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafButtonAssignment {

	public static void main(String[] args) {
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("Guest");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/button.xhtml");
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("dashboard")) {
			System.out.println("Title is verified");
		}
		driver.navigate().back();
		boolean enabled = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		System.out.println(enabled);
		if(!enabled) {
			System.out.println("Confirm if the button is disabled is enabled");
		}
        WebElement SubmitButton = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
        Point location = SubmitButton.getLocation();
        int x = location.getX();
        int y = location.getY();
        System.out.println(x + " " + y);
        WebElement buttonColor = driver.findElement(By.xpath("//span[text()='Save']"));
        String color = buttonColor.getCssValue("background-color");
        System.out.println("Save button background color is:" + color);
        WebElement height = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
        Dimension size = height.getSize();
        int h = size.height;
        int w = size.width;
        System.out.println("Height & Width of submit button is :"+  h + " "  + w);
        driver.close();
	}

}
