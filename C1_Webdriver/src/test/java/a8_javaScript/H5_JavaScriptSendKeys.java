package a8_javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H5_JavaScriptSendKeys {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://www.bing.com/");
		WebElement input=wd.findElement(By.name("q"));
//		input.sendKeys("chennai");
		
		JavascriptExecutor jse= (JavascriptExecutor)wd;
//		jse.executeScript("arguments[0].value='chennai'", input);
		
		String data1="chennai";
		jse.executeScript("arguments[0].value='"+data1+"'", input);
		
	}
}
