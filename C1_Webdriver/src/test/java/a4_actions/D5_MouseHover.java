package a4_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D5_MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		
		wd.manage().window().maximize();
		wd.navigate().to("https://djangovinoth.pythonanywhere.com/login/");
		
		WebElement username=wd.findElement(By.id("id_username"));
	    username.sendKeys("prabakaran");
	    
	    WebElement password=wd.findElement(By.id("id_password"));
		password.sendKeys("Gspraba@23");
		
		password.submit();
		
		wd.get("https://djangovinoth.pythonanywhere.com/mousehover/");		
		WebElement resume=wd.findElement(By.id("id11"));
		WebElement item=wd.findElement(By.id("id13"));
		WebElement veronica=wd.findElement(By.id("id15"));
		
		Actions a=new Actions(wd);
		Thread.sleep(2000);
		a.moveToElement(resume).build().perform();
		Thread.sleep(2000);
		a.moveToElement(item).build().perform();
		Thread.sleep(2000);
		a.moveToElement(veronica).build().perform();
		Thread.sleep(2000);
		a.click(veronica).build().perform();
//		a.moveToElement(resume).moveToElement(item).moveToElement(veronica).click().build().perform();
	}
}
