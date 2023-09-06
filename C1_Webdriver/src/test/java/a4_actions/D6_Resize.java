package a4_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D6_Resize {

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
		
		wd.get("https://djangovinoth.pythonanywhere.com/resize/");
		WebElement resize=wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div[1]/div/div/div[3]"));
		
		Actions a=new Actions(wd);
//		1 way
//		a.clickAndHold(resize).build().perform();
//		Thread.sleep(2000);
//    	a.moveToElement(resize, 80, 80).build().perform();
//    	Thread.sleep(2000);
//    	a.release(resize).build().perform();

//		2 way
//		a.dragAndDropBy(resize, 80, 80).perform();
		
//		3 way
		a.clickAndHold(resize).moveByOffset(80, 80).release().build().perform();
		
	}
}
