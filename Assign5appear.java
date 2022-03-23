package Week4day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign5appear {

	public static void main(String[] args) {
	
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();

			driver.get("http://www.leafground.com/pages/appear.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			


	}

}
