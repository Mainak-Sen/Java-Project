package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAINAK SEN\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).sendKeys("Beng");
		Thread.sleep(2000);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		/*driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.id("fromPlaceName")).getText());*/
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		
		int i=0;
		while(!text.equalsIgnoreCase("BENGALUR INTERNATION AIRPORT"))
		{
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text);
			
			if(i>10)
			{
				break;
			}
			
		}
		
		if(i>10)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element  found");
		}
	}

}
