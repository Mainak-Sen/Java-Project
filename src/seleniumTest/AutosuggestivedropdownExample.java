package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestivedropdownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//entering "uni" in the edit box and checking if United Kingdom (UK)  is there in options to be refleted in the edit box 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAINAK SEN\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"autocomplete\").value;";
		String text=(String) js.executeScript(script);
		
		int count=0;
		while(!text.equalsIgnoreCase("United Kingdom (UK)"))
		{
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			count++;
			text=(String) js.executeScript(script);
			System.out.println(text);
			if(count>15)
			{
				break;
			}
		}
		
		if(count>15)
		{
			System.out.println("Element not found ");
		}
		else
		{
			System.out.println("Element found successfully");
		}
		

	}

}