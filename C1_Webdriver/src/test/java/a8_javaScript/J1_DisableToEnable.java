package a8_javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J1_DisableToEnable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();

		wd.navigate().to("https://djangovinoth.pythonanywhere.com/login/");

		WebElement username = wd.findElement(By.id("id_username"));
		username.sendKeys("prabakaran");

		WebElement password = wd.findElement(By.id("id_password"));
		password.sendKeys("Gspraba@23");

		password.submit();

		wd.get("https://djangovinoth.pythonanywhere.com/enabledOrDisabled/");
		
		WebElement input=wd.findElement(By.id("dis"));
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)wd;
		jse.executeScript("arguments[0].removeAttribute('disabled')", input);
	
	}
	
	
}
