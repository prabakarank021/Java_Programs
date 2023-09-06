package a1_browserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A5_GetTitle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		
		wd.manage().window().maximize();;
//		wd.get("facebook.com");
		wd.get("https://www.facebook.com/");
		String title=wd.getTitle();
		System.out.println(title);
	}
}
