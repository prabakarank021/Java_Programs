package b5_chromeOptions;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class K1_DisableInfoBar {

	public static void main(String[] args) {
		
//		Settings
		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--disable-infobars"); //This is old version for removing the infobar, some office use this version also
		
//		                                infobar
		options.setExperimentalOption("useAutomationExtension", false); // to remove the infobar
		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation")); // Once we remove info bar, automatically automation also remove, in this case we need to tell enable the automation
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver(options);
		wd.get("https://www.facebook.com/login/");
		wd.findElement(By.id("loginbutton")).click();
	}
}
