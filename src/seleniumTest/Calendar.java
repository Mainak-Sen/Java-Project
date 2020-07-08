package seleniumTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAINAK SEN\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		//driver.findElement(By.cssSelector("[ class='datepicker-days'] [class='datepicker-switch']")).click();
		//Year 2023
		/*while(!driver.findElement(By.xpath("//div[@class='datepicker-months']//th[@class='datepicker-switch']")).getText().contains("2021"))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-months']//th[@class='next']")).click();
		}*/
		
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']//table//thead//tr//th[2][@class='datepicker-switch']")).getText().contains("March"))
		{
			driver.findElement(By.cssSelector("[ class='datepicker-days'] [class='next']")).click();
		}
		
		//Month March
		/*int monthnumbers =driver.findElements(By.className("month")).size();
		List<WebElement> months =driver.findElements(By.className("month"));
		
		for (int j=0;j<monthnumbers;j++)
		{
			String text2 =driver.findElements(By.className("month")).get(j).getText();
			if(text2.contains("March"))
					{
						driver.findElements(By.className("month")).get(j).click();
						break;
					}
			
			
		}*/
		//Day 30
		int datenumbers =driver.findElements(By.className("day")).size();
		List<WebElement> dates =driver.findElements(By.className("day"));
		
		for (int i=0;i<datenumbers;i++)
		{
			String text =driver.findElements(By.className("day")).get(i).getText();
			if(text.contains("30"))
					{
						driver.findElements(By.className("day")).get(i).click();
						break;
					}
			
			
		}
	}

}
