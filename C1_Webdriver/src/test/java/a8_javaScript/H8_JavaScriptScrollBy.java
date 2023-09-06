package a8_javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H8_JavaScriptScrollBy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://www.google.com/");
		WebElement input=wd.findElement(By.name("q"));
		input.sendKeys("chennai");
	    input.submit();
	    Thread.sleep(2000);
//	    window.scrollBy(x,y)
	    
	    JavascriptExecutor jse= (JavascriptExecutor)wd;
	    jse.executeScript("window.scrollBy(0,1000)"); //There is no specific element so we don't give the arguments
	    
	    Thread.sleep(2000);
	    jse.executeScript("window.scrollBy(0,-500)");
	
	}
}
