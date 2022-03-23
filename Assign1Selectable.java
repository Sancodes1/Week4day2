package Week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();

			driver.get("http://www.leafground.com/pages/selectable.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			   Actions builder = new Actions(driver);
			 WebElement Item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
			 WebElement Item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
			 builder.click(Item1).click(Item3).perform();
	}

}
