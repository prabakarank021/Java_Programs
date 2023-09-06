package b5_chromeOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class K4_HeadLess {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		
//		Headless - virtual browser - virtual Doms
//		fastest Dom is virtual Dom compare to all
//		Its very very faster than real browser
//		we can't take screenshot in headless browser 
		
		options.addArguments("--headless");
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.get("https://www.google.co.in/");
		System.out.println(wd.getTitle());
		wd.findElement(By.name("q")).sendKeys("chennai");
		wd.findElement(By.name("q")).submit();
		Thread.sleep(2000);
		System.out.println(wd.getTitle());
		wd.navigate().back();
		Thread.sleep(2000);
		System.out.println(wd.getTitle());
	    wd.navigate().forward();
		Thread.sleep(2000);
	    System.out.println(wd.getTitle());
		
	}
}
