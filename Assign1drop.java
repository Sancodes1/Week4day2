package Week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();

			driver.get("http://www.leafground.com/pages/drop.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			   Actions builder = new Actions(driver);
			 WebElement from = driver.findElement(By.id("draggable"));
			 WebElement to = driver.findElement(By.id("droppable"));
			 builder.dragAndDrop(from, to).perform();
				
				
				String textTo = to.getText();

				if(textTo.equals("Dropped!")) {
					System.out.println(" Source is dropped to target as expected");
				}else {
					System.out.println(" Source couldn't be dropped to target as expected");
				}
			
				driver.close();

			}
	}


