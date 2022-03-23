package Week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1drag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();

			driver.get("http://www.leafground.com/pages/drag.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			
			 WebElement element = driver.findElement(By.id("draggable"));
			Point location = element.getLocation();
			int x=location.getX();
			int y=location.getY();
			Actions builder = new Actions(driver);
			builder.dragAndDropBy(element, x+100,y+150).perform();
	}

}
