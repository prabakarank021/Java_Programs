package a7_alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H1_PromtAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://djangovinoth.pythonanywhere.com/login/");
		
		WebElement username=wd.findElement(By.name("username"));
	    username.sendKeys("prabakaran");
	    
	    WebElement password=wd.findElement(By.name("password"));
	    password.sendKeys("Gspraba@23");
	    password.submit();
	    
	    wd.get("https://djangovinoth.pythonanywhere.com/alert/");
	    wd.findElement(By.id("id3")).click();
	    Thread.sleep(2000);
	    
	    Alert a=wd.switchTo().alert();
	    String data=a.getText();
	    System.out.println(data);
	    a.sendKeys("chennai");
	    a.accept();
	    
	}
}
