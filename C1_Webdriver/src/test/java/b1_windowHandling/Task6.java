package b1_windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://www.amazon.in/");	
		
		WebElement input=wd.findElement(By.id("twotabsearchtextbox"));
		input.sendKeys("samsung mobile");
		input.submit();
		Thread.sleep(2000);
		
		WebElement element=wd.findElement(By.className("s-image"));
		element.click();
		System.out.println(element.getText());
		
		Thread.sleep(2000);
//		WebElement element1=wd.findElement(By.id("productTitle"));
//		System.out.println(element1.getText());
	    
	    Set<String> s=wd.getWindowHandles();
	    Iterator<String> it=s.iterator();
	    String parentId=it.next();
	    String childId=it.next();
	
	    System.out.println(parentId);
	    System.out.println(childId);
	    
	}
}
