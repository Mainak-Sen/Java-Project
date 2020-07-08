package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment6Section12 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAINAK SEN\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Actions a =new Actions(driver);
		driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//div[@id='checkbox-example']//label[1]//input")).click();
		String opt =driver.findElement(By.xpath("//div[@id='checkbox-example']//label[1]")).getText();
		WebElement wb=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select s = new Select(wb);
		s.selectByVisibleText(opt);
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys(opt);
		driver.findElement(By.cssSelector("input#alertbtn")).click();
		String text= driver.switchTo().alert().getText();
		
		if(text.contains(opt))
		{
			System.out.println("Test Passed");
		}
		else
		{
			
			System.out.println("Test Failed");
		}
			

	}

}
