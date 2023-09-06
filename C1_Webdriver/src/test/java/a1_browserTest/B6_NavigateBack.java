package a1_browserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B6_NavigateBack {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();

		wd.manage().window().maximize();
		// wd.get("https://www.facebook.com/");

		wd.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(2000);
		wd.navigate().back();
	}
}