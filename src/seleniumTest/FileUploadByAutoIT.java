package seleniumTest;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FileUploadByAutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		String downloadPath= System.getProperty("user.dir");
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		//prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.default_directory", downloadPath);
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAINAK SEN\\Webdrivers\\Chromedriver81\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Work\\CV_Updated_Copy\\FileUploadScript.exe");
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='processTask']")));
		driver.findElement(By.xpath("//button[@id='processTask']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='downloader__btn active']")));
		driver.findElement(By.xpath("//a[@class='downloader__btn active']")).click();
		Thread.sleep(5000);
		File f=new File(downloadPath+"/CV_MainakSen_Updated.pdf");

		if(f.exists())

		{

		Assert.assertTrue(f.exists());

		if(f.delete())

		System.out.println("file deleted");

		}

		}
}
