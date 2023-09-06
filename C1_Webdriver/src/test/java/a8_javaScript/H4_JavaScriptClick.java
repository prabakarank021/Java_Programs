package a8_javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H4_JavaScriptClick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://www.google.com/");
		WebElement gmail=wd.findElement(By.linkText("Gmail"));
//	    gmail.click();
//      java script - click();
//		((JavascriptExecutor)wd).executeScript(key, object....args) // object....args - means we can give more than one argument, therefore we give key as a arguments[index].function
		
		JavascriptExecutor jse=(JavascriptExecutor)wd;
//		jse.executeScript("My java script", "element1", "element1", "element1", "element1", "element1")
		
		jse.executeScript("arguments[0].click()", gmail);

//		jse.executeScript("arguments[1].click()", gmail, images); // Its click images
//		jse.executeScript("arguments[2].click()", gmail, images, links); // Its click links
	}
}
