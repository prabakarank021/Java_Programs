package a2_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C1_IdLocator {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		
		wd.manage().window().maximize();
		wd.navigate().to("https://www.bing.com/");
		
//		wd.findElement(); -    WebElement    -    Exception 
//		wd.findElements(by); - List<WebElement> - No Exception - Returns 0
		
		WebElement element=wd.findElement(By.id("sb_form_q"));
		element.sendKeys("Chennai");
	}
}
