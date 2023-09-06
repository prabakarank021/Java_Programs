package a8_javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L8_Dom {

	public static void main(String[] args) {

		//DOM - Document object model - Very fast, high accuracy, Never fail
		
		//React - Created by the Facebook company
		//Angular - Created by the google company
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();

		wd.navigate().to("https://djangovinoth.pythonanywhere.com/login/");

		WebElement username = wd.findElement(By.id("id_username"));
		username.sendKeys("prabakaran");

		WebElement password = wd.findElement(By.id("id_password"));
		password.sendKeys("Gspraba@23");

		password.submit();

		wd.get("https://djangovinoth.pythonanywhere.com/dom/");

		String input = "document.forms[1].elements[1].value='chennai'";
		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript(input);

		// JavascriptExecutor jse=(JavascriptExecutor)wd;
		// jse.executeScript("document.forms[1].elements[1].value='chennai'");
	}

}
