package a4_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D8_DoubleClick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		
		wd.manage().window().maximize();
		wd.navigate().to("https://djangovinoth.pythonanywhere.com/login/");
		
		WebElement username=wd.findElement(By.id("id_username"));
	    username.sendKeys("prabakaran");
	    
	    WebElement password=wd.findElement(By.id("id_password"));
		password.sendKeys("Gspraba@23");
		
		password.submit();
		
		wd.get("https://djangovinoth.pythonanywhere.com/doubleclick/");		
		WebElement dc=wd.findElement(By.id("dbclick1"));
		
		Actions a=new Actions(wd);
		a.doubleClick(dc).build().perform();
    	
	}
}
