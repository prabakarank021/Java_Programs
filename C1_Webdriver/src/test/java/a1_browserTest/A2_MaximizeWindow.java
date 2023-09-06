package a1_browserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A2_MaximizeWindow {
		
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		
		wd.manage().window().maximize();
//		wd.manage().window().minimize();
//		manage - It provides some option for the entire browser
//		window - It provides some option for the entire window in that browser
	}
}