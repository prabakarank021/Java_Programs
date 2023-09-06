package b5_chromeOptions;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class K3_PopUpBlocking {

	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications"); //Block the notification pop-up
//		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));

		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.get("https://www.justdial.com/");
		
	}
}
