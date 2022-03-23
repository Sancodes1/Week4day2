package Week4day2;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.Document;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class SortTable2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//open url
		driver.get("http://www.leafground.com/pages/sorttable.html");
		//maximize window
		driver.manage().window().maximize();
		//implicit wait applied
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//screenshot before sorting table
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		File targetFile = new File("./Snaps/BeforeSort.jpg");
		FileUtils.copyFile(screenshot, targetFile);
		
		//table identified
		WebElement table = driver.findElement(By.id("table_id"));
		
		List<WebElement> row = table.findElements(By.tagName("tr"));
		
		List<String> list1 = new ArrayList<String>();
		
		//iterate over the Name column
		  for(int i=1;i<row.size();i++) { 
			  WebElement eachRow1 = row.get(i); 
			  WebElement nameCol1 = eachRow1.findElements(By.tagName("td")).get(1);
			  String beforeSortList = nameCol1.getText();
			  list1.add(beforeSortList); 
			  }
		 
		Collections.sort(list1);
		System.out.println(list1);
		
		//clicked on Name header to sort the row
		driver.findElement(By.xpath("//table[@id='table_id']//th[2]")).click();
		
		//iterrate over the name column after sorting
		List<WebElement> row1 = table.findElements(By.tagName("tr"));
		List<String> list2 = new ArrayList<String>();
		  for(int j=1;j<row1.size();j++) {
			  WebElement eachRow2 = row1.get(j);
			  WebElement nameCol2 = eachRow2.findElements(By.tagName("td")).get(1);
			  String afterSortList = nameCol2.getText();
			  list2.add(afterSortList);
		  }
		
		  //screenshot after table sorting
		File screenshot1 = driver.getScreenshotAs(OutputType.FILE);
		File targetFile1 = new File("./Snaps/AfterSort.jpg");
		FileUtils.copyFile(screenshot1, targetFile1);
		
		System.out.println(list2);
	}

}
