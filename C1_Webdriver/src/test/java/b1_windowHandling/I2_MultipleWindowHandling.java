package b1_windowHandling;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class I2_MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	     WebDriver wd=new ChromeDriver();
	     wd.manage().window().maximize();
		
	     wd.get("https://www.flipkart.com/");
	     Thread.sleep(2000);
	     wd.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	     
	     WebElement search= wd.findElement(By.name("q"));
	     search.sendKeys("samsung mobiles");
	     search.sendKeys(Keys.ENTER);
	     Thread.sleep(4000);
	     List<WebElement> link= wd.findElements(By.className("_4rR01T")); //Selenium have a rights to focus only one tab(window) at a time
	     link.get(0).click(); //Selenium can handle the multi threads but can't handle multi tab(window) at a time
	     
	     Thread.sleep(2000);
	     
//	     wd.getWindowHandle() - Get current window session
//	     wd.getWindowHandles() - get current instance window session 
	     
//	     getWindowHandles() - Returns set, But That has inbuilt of LinkedHashSet Thats why we get it in order wise and we confidently say first one is parent second one is child because It has LinkedHashSet (Inserted order)
	     
//	     LinkedHashSet
	     Set<String> window=wd.getWindowHandles();
	     Iterator<String> it=window.iterator();
	     String parentId=it.next();
	     String childId=it.next();
	     
//	     switch to child window
	     wd.switchTo().window(childId);	
	     
	     String data1=wd.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/h1/span")).getText();
	     String data2=wd.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div[4]/div[1]/div/div[1]")).getText();
	     
	     System.out.println(data1);
	     System.out.println(data2);
	     
//	     wd.close(); //Close the current window 
	     
//	     switch to parent window
	     wd.switchTo().window(parentId);
	     
	     String data3=wd.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).getText();
	     System.out.println(data3);
	     wd.close(); //Close the parent window

//	     wd.quit();  //close the wd instance of all window - It kill the wd of all windows
	
	}
}
