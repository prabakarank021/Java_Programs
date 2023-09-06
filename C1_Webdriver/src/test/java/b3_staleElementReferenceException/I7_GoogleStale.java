package b3_staleElementReferenceException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class I7_GoogleStale {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		
		wd.manage().window().maximize();
		wd.navigate().to("https://www.google.com/");
		
		WebElement input=wd.findElement(By.name("q"));
		input.sendKeys("Chennai");
		input.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		wd.navigate().back();
		input.sendKeys("Guindy");
		input.sendKeys(Keys.ENTER);
		
	}
}
