package seleniumTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAINAK SEN\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table=driver.findElement(By.tagName("table"));//shrinking the scope to only the  Webtable in the page 
		WebElement firstrow=table.findElements(By.tagName("tr")).get(1); //getting a single row element i.e. the first row 
		System.out.println("The number of rows in the WebTable is :"+ table.findElements(By.tagName("tr")).size());
		//extracting the number of elements with tagname "td" in the first row which is the count of number of columns .
		System.out.println("The number of columns in the WebTable is :"+ firstrow.findElements(By.tagName("td")).size());
		
		WebElement row2=table.findElements(By.tagName("tr")).get(2);//shrinking the  scope to row2 only 
		List<WebElement> row2data= row2.findElements(By.tagName("td"));//row2data to be extracted 
		
		//extracting the content of row2
		for (int i=0;i<row2.findElements(By.tagName("td")).size();i++)
		{
			System.out.println(row2data.get(i).getText());

		}	
		
	}

}
