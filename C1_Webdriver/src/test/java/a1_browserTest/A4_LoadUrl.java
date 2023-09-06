package a1_browserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A4_LoadUrl {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		
		wd.manage().window().maximize();
		
//		wd.get("facebook.com");//(invalid argument error) Program says It is not in the format i expect, Thats why it gives invalid argument error, Don't give the url like this format  
		
		wd.get("https://www.facebook.com/"); //we always give only full fledged url. 
		
//		get - It means getting the url from your side. 
		
	}
}
