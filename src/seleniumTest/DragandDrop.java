package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	private static Logger log = LogManager.getLogger(TestsamplewithLog4j.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("Setting chrome driver  properties");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAINAK SEN\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
		log.debug("Navigating to jqueryui.com");
		driver.get("https://jqueryui.com/droppable/");
		log.info("Landed on jqueryui.com");
		driver.manage().window().maximize();
		log.info("Maximised  browser window");
		log.debug("Retrieving the count of number of frames");
		int numberofframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println(numberofframes);
		log.info("Frame count retrieved ");
		log.debug("Switching to frame index 0");
		
		try
		{
			driver.switchTo().frame(0);
			log.info("Succeefully switched to frame ");
		}
		catch(Exception e)
		{
			log.error("Cannot identify the frame");
		}
		
		log.debug("Identifying draggable and droppable elements");
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		log.debug("Performing drag and drop");
		
		Actions a = new Actions(driver);
		a.dragAndDrop(draggable, droppable).build().perform();
		log.info("Drag and Drop operation performed successfully");
		
		
		

	}

}
