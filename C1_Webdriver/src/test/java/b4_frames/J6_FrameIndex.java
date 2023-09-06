package b4_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J6_FrameIndex {

	public static void main(String[] args) {
		
//		First we need to check that site have more than one frame or not, if that have only one frame (default switch) so we can go with 0 index
//		If that have more than one frame first we check that element has any name(id) or not, if name has we can use it or else we can go with list  
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://jqueryui.com/tooltip/");
		
//		wd.switchTo().frame("index");
	
		wd.switchTo().frame(0);
		WebElement input=wd.findElement(By.id("age"));
		input.sendKeys("10");
		wd.switchTo().defaultContent(); //Topmost parent // Its switch to first opened page of webDriver 
//		wd.switchTo().parentFrame(); //Immediate parent
		wd.findElement(By.linkText("Draggable")).click();
	}
}
