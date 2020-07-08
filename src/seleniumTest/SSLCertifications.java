package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//General chrome profile to set some capabilities 
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//local chrome browser 
		ChromeOptions c = new ChromeOptions();
		c.merge(dc);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAINAK SEN\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);

	}

}
