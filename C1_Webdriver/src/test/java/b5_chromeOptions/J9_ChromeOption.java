package b5_chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J9_ChromeOption {

	public static void main(String[] args) {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver wd=new ChromeDriver(); // Default profile - There is no setting - It provides default chrome browser in selenium  
		
//		Settings
		ChromeOptions options=new ChromeOptions(); //It provides some options for access the chrome settings
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver(options); //Now It provide some options for change the chrome setting, until wd instence close
		
		wd.get("https://www.flipkart.com/");
	}
}
