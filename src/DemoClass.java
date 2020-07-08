import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAINAK SEN\\Webdrivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\MAINAK SEN\\Webdrivers\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//driver.get("http://google.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.navigate().to("http://yahoo.com");
		//System.out.println(driver.getCurrentUrl());
		//driver.navigate().back();
		//driver.navigate().forward();
		//System.out.println(driver.getPageSource());
		//driver.close();
		driver.get("http://facebook.com");
		driver.findElement(By.name("email")).sendKeys("mainaksenrockz@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("MunnahGautamBaban");
		//driver.findElement(By.id("u_0_b")).click();
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		
	}

}
