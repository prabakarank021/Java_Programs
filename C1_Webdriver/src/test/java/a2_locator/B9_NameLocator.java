package a2_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B9_NameLocator {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		
		wd.manage().window().maximize();
		wd.navigate().to("https://www.bing.com/");
		
//		wd.findElement();  -    WebElement    -    Exception 
//		wd.findElements(); - List<WebElement> - No Exception - Returns 0
		
		WebElement element=wd.findElement(By.name("q")); // By.name - By means by which element you have to locate - We can say By.name or id,xpath,css....etc.
		
//		element.sendKeys(keysToSend); //KeysToSend - CharSequences - Which means characters in the sequence order that are not a string  
		
		element.sendKeys("Chennai"); //sendKeys - Send the keys for the element that's why this function owns that name 
		
	}
}
