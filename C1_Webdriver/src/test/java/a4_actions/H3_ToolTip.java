package a4_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H3_ToolTip {

	public static void main(String[] args) {
		
//		ToolTip is a mouse related action, But we can achieve without using actions class
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://djangovinoth.pythonanywhere.com/login/");
		
		WebElement username=wd.findElement(By.name("username"));
	    username.sendKeys("prabakaran");
	    
	    WebElement password=wd.findElement(By.name("password"));
	    password.sendKeys("Gspraba@23");
	    password.submit();
	    
	    wd.get("https://djangovinoth.pythonanywhere.com/tooltip/");
	    WebElement input=wd.findElement(By.id("age"));
		String data=input.getAttribute("title");
		System.out.println(data);
	}
}
