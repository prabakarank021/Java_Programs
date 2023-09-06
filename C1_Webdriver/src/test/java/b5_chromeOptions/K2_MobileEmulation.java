package b5_chromeOptions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class K2_MobileEmulation {

	public static void main(String[] args) {

		Map<String, String> mobile = new HashMap<String, String>();
		mobile.put("deviceName", "iPhone 12 Pro");
		
		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("mobileEmulation",mobile );
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.get("https://www.facebook.com/login/");
	}
}