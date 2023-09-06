package a1_browserTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A8_BrowserResize {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.facebook.com/");
		
		Dimension d=new Dimension(500, 600);
		wd.manage().window().setSize(d);;
	}
}
