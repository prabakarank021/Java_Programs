package a7_alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H2_BootstrapAlert {

	public static void main(String[] args) throws InterruptedException {
		
//		This alert is not in javaScript; we're not creating an alert interface. 
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://djangovinoth.pythonanywhere.com/login/");
		
		WebElement username=wd.findElement(By.name("username"));
	    username.sendKeys("prabakaran");
	    
	    WebElement password=wd.findElement(By.name("password"));
	    password.sendKeys("Gspraba@23");
	    password.submit();
	    
	    wd.get("https://djangovinoth.pythonanywhere.com/bootstrapalert/no/");
	    WebElement link= wd.findElement(By.linkText("bootstrap info alert"));	
		link.click();
	    Thread.sleep(5000);
		WebElement text=wd.findElement(By.xpath("/html/body/main/div/div[2]/div"));
		System.out.println(text.getText());
	}
	
}
