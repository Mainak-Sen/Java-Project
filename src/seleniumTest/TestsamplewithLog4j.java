package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class TestsamplewithLog4j {
	
	private static Logger log = LogManager.getLogger(TestsamplewithLog4j.class.getName());

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		log.debug("Setting chrome driver  properties");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAINAK SEN\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
		log.debug("Navigating to Amazon.com");
		driver.get("https://www.amazon.com/");
		log.info("Landed on Amazon.com");
		driver.manage().window().maximize();
		log.info("Maximised  browser window");
		Actions a =new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick().build().perform();
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
		
		
		

	}

}
