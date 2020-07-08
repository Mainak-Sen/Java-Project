package seleniumTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableColumnsSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAINAK SEN\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		//driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		int n =driver.findElements(By.cssSelector("tr td:nth-child(2)")).size();
		List<WebElement> list =driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		ArrayList<String> originallist= new ArrayList<String>();
		ArrayList<String> copiedlist= new ArrayList<String>();
		
		for(int i=0;i<n;i++)
		{
			//System.out.println(originallist.get(i).getText());
			originallist.add(list.get(i).getText());
		}
		System.out.println(originallist);
		
		
		for(int j=0;j<originallist.size();j++)
		{
			//System.out.println(originallist.get(i).getText());
			copiedlist.add(originallist.get(j));
		}
		 
		Collections.sort(copiedlist);
		Collections.reverse(copiedlist);
		
		
		System.out.println(copiedlist);
		
		Assert.assertTrue(originallist.equals(copiedlist));


	}

}
