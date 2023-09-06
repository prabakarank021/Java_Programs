package a5_dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F4_DeselectDropDown {

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

		wd.get("https://djangovinoth.pythonanywhere.com/dropdown/");
        WebElement dropdown=wd.findElement(By.id("numbers"));
	
        Select s=new Select(dropdown);
        
        s.selectByIndex(0);
        Thread.sleep(2000);
        
        s.selectByIndex(2);
        Thread.sleep(2000);
        
        s.selectByIndex(4);
        Thread.sleep(2000);
        
        s.selectByIndex(1);
        Thread.sleep(2000);
        
//        s.deselectAll();
//        s.deselectByIndex(index);
//        s.deselectByValue(value);
//        s.deselectByVisibleText(text);
        
        s.deselectByIndex(0);
        Thread.sleep(2000);
        
        s.deselectByIndex(2);
        Thread.sleep(2000);
        
        s.deselectByIndex(4);
        Thread.sleep(2000);
        
        s.deselectByIndex(1);
        Thread.sleep(2000);
        
	}
}
