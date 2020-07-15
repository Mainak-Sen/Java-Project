package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.manage().window().maximize();
		WebDriverWait w=new WebDriverWait(driver,30);
		driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();
		WebElement hidden=driver.findElement(By.id("results"));
		w.until(ExpectedConditions.visibilityOf(hidden));
		System.out.println(hidden.getText());
		
		

	}

}
