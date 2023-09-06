package a4_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D4_Slider {

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
		
		wd.get("https://djangovinoth.pythonanywhere.com/slider/");		
		WebElement slider=wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div[1]/div/div/span"));
		
		Actions a=new Actions(wd);
//		a.dragAndDropBy(slider, 0, 100).build().perform(); - If you give wrong coordinates it won't comes error, It try to move the y axis 
		
		a.dragAndDropBy(slider, 100, 0).build().perform();
		Thread.sleep(2000);
		a.dragAndDropBy(slider, -100, 0).build().perform();
//		a.clickAndHold(slider).moveByOffset(100, 0).release().build().perform();
		
//		WebElement slider1=wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div[3]/div/div/span"));
//		
//		Thread.sleep(2000);
//		a.dragAndDropBy(slider1, 0, 50).build().perform();
//		a.dragAndDropBy(slider1, 0, -50).build().perform();
		
		
		
//		WebElement slider2=wd.findElement(By.id("custom-handle"));
//		
//		Thread.sleep(2000);
//		a.dragAndDropBy(slider2, 50, 0).build().perform();
//		a.dragAndDropBy(slider2, -30, 0).build().perform();

		
	}
}
