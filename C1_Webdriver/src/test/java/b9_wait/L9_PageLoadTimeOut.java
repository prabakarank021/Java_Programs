package b9_wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L9_PageLoadTimeOut {

	public static void main(String[] args) {
		
		//which application has below 30 second pageLoading time, that is best application 
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		wd.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
	}
}
