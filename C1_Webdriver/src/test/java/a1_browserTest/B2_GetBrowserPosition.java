package a1_browserTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B2_GetBrowserPosition {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		Dimension d=new Dimension(500, 600);
		wd.manage().window().setSize(d);
		
		Thread.sleep(2000);
		System.out.println("Before setposition - "+wd.manage().window().getPosition());
		Point p=new Point(500, 200);
		wd.manage().window().setPosition(p);
		System.out.println("After setposition - "+wd.manage().window().getPosition());
	}
}
