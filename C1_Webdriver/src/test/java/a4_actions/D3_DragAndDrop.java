
package a4_actions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D3_DragAndDrop {

	public static void main(String[] args) {
		
//		Actions a=new Actions(driver); -> To perform Mouse and keyboard relevant events 
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		
		wd.manage().window().maximize();
		wd.get("https://djangovinoth.pythonanywhere.com/login/");
		
		WebElement username=wd.findElement(By.id("id_username"));
	    username.sendKeys("prabakaran");
	    
	    WebElement password=wd.findElement(By.id("id_password"));
		password.sendKeys("Gspraba@23");
		
		password.submit();
		
		wd.get("https://djangovinoth.pythonanywhere.com/draganddrop/");		
		WebElement src=wd.findElement(By.id("draggable"));
		WebElement dst=wd.findElement(By.id("droppable"));
		
		Actions a=new Actions(wd);
		//Build, Perform  - Once We use actions class then you have to use build and perform function compulsory
	    a.dragAndDrop(src, dst).build().perform();// ->In this case we can use perform function only but we have to use both function in chained action compulsory
//	    Drag and Drop functions include defaults such as click-and-hold, move-to-element, and release.
	}
}
