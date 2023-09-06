package a1_browserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A6_CurrentUrl {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		
		wd.manage().window().maximize();
//		wd.get("facebook.com");
		wd.get("https://www.flipkart.com/");
		String currentUrl=wd.getCurrentUrl();
		System.out.println(currentUrl);
	}
}
