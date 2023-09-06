package a1_browserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B5_Navigate {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();

		wd.manage().window().maximize();
		// wd.get("https://www.facebook.com/"); - Get function don't have any history own property

		wd.navigate().to("https://www.facebook.com/"); // - Navigate.to is better than the get function, why because this function only has a history own property 
	}
}