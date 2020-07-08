package seleniumTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;



public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAINAK SEN\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions a =new Actions(driver);
		driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/");
		a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]"))).click().build().perform();
		//System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")));type name = new type();
		driver.findElement(By.cssSelector("a[href*='windows']")).click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> ab=ids.iterator();
		String ParentWindowID=ab.next();
		driver.switchTo().window(ab.next());
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		driver.switchTo().window(ParentWindowID);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
		
		
		

	}

}
