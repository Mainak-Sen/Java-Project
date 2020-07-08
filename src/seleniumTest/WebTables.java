package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAINAK SEN\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22661/rsa-vs-aus-1st-odi-australia-tour-of-south-africa-2020");
		WebElement table =driver.findElement(By.cssSelector("div[class=\"cb-col cb-col-100 cb-ltst-wgt-hdr\"]"));
		int count =table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i=0;i<count-2;i++)
		{
			System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
		}
		System.out.println(table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		System.out.println(table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
	}

}
