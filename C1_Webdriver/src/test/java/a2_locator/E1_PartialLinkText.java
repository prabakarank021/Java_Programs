package a2_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E1_PartialLinkText {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		
		wd.manage().window().maximize();
		wd.navigate().to("https://www.google.com/");
		
        WebElement gmail=wd.findElement(By.partialLinkText("ma")); // It found multiple same name partialLinkText by default, it takes the first one. If we want the last one we use the findElements function it returns a List of webElement now we can select any of one using the index number. 
		gmail.click();
	}
}
