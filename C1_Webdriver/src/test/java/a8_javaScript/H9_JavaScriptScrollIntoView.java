package a8_javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H9_JavaScriptScrollIntoView {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://en.wikipedia.org/wiki/Chennai");
		WebElement link=wd.findElement(By.linkText("History of Chennai"));
//		scrollIntoView(true)
		
		JavascriptExecutor jse=(JavascriptExecutor)wd;
		jse.executeScript("arguments[0].scrollIntoView(true)", link);

//		Actions a=new Actions(wd);
//		a.scrollToElement(link).perform();
		
	}
}
