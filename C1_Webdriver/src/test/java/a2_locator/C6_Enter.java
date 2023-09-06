package a2_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C6_Enter {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		
		wd.manage().window().maximize();
		wd.navigate().to("https://www.google.com/");
		
		WebElement element=wd.findElement(By.name("q"));
		element.sendKeys("Chennai");
		
		element.sendKeys(Keys.ENTER); // Keys is an Enumeration, whatever constant things are stored in enumerators. keyboard keys are constant that's why we stored keys in enumerators 
		
	}
}
