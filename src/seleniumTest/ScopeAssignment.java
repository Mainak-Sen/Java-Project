package seleniumTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScopeAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAINAK SEN\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement footercolumn1 =driver.findElement(By.xpath("//div[@id='gf-BIG']//table//tbody//tr//td[1]//ul"));
		int n=footercolumn1.findElements(By.tagName("a")).size();
		
		for(int i=1;i<n;i++)
		{
			String CtrlClicklink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footercolumn1.findElements(By.tagName("a")).get(i).sendKeys(CtrlClicklink);
			Thread.sleep(8000L);
		}
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> abc=ids.iterator();
		abc.next();
		while(abc.hasNext())
		{
			driver.switchTo().window(abc.next());
			System.out.println(driver.getTitle());
		}

	}

}
