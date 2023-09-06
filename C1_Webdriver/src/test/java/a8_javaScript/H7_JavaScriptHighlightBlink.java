package a8_javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H7_JavaScriptHighlightBlink {

	public static void main(String[] args) throws InterruptedException {

//		WebDriverManager.chromedriver().setup();
//		WebDriver wd = new ChromeDriver();
		
		WebDriverManager.edgedriver().setup();
		WebDriver wd = new EdgeDriver();
		wd.manage().window().maximize();

		wd.get("https://www.google.com/");
		WebElement logo = wd.findElement(By.className("lnXdpd"));
		// "element.style.border='5px solid red'"

		JavascriptExecutor jse = (JavascriptExecutor) wd;
		
//		for (int i = 0; i < 10; i++) {
//			Thread.sleep(200);
//			jse.executeScript("arguments[0].style.border='5px solid red'", logo);
//			Thread.sleep(200);
//			jse.executeScript("arguments[0].style.border='5px solid white'", logo);
//		}
		
		for (int i = 0; i < 2; i++) {
			Thread.sleep(200);
			jse.executeScript("arguments[0].style.border='5px solid #4285f4'", logo);
			Thread.sleep(200);
			jse.executeScript("arguments[0].style.border='5px solid white'", logo);
			Thread.sleep(200);
			jse.executeScript("arguments[0].style.border='5px solid #ea4335'", logo);
			Thread.sleep(200);
			jse.executeScript("arguments[0].style.border='5px solid white'", logo);
			Thread.sleep(200);
			jse.executeScript("arguments[0].style.border='5px solid #fbbc05'", logo);
			Thread.sleep(200);
			jse.executeScript("arguments[0].style.border='5px solid white'", logo);
			Thread.sleep(200);
			jse.executeScript("arguments[0].style.border='5px solid #4285f4'", logo);
			Thread.sleep(200);
			jse.executeScript("arguments[0].style.border='5px solid white'", logo);
			Thread.sleep(200);
			jse.executeScript("arguments[0].style.border='5px solid #34a853'", logo);
			Thread.sleep(200);
			jse.executeScript("arguments[0].style.border='5px solid white'", logo);
			Thread.sleep(200);
			jse.executeScript("arguments[0].style.border='5px solid #ea4335'", logo);
			Thread.sleep(200);
			jse.executeScript("arguments[0].style.border='5px solid white'", logo);

		}
	}
}
