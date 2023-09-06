package b5_chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class K6_UntrustedSite {
 
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();

		options.setAcceptInsecureCerts(true); //Use only for load url in office application   
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);	
	
	}	
}