package a8_javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H6_JavaScriptHighlight {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://www.google.com/");
		WebElement logo=wd.findElement(By.className("lnXdpd"));
		
//		Highlight - "element.style.border='5px solid red'" 
		
		JavascriptExecutor jse= (JavascriptExecutor)wd;
		jse.executeScript("arguments[0].style.border='5px solid yellow'", logo);
		
	}
}
