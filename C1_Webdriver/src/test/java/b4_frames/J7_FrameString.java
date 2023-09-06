package b4_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J7_FrameString {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://jqueryui.com/tooltip/");
		
		wd.switchTo().frame("frame id or name");
		
		WebElement input=wd.findElement(By.id("age"));
		input.sendKeys("10");
		wd.switchTo().defaultContent(); //Topmost parent  
//		wd.switchTo().parentFrame(); //Immediate parent
		wd.findElement(By.linkText("Draggable")).click();
	    
	}
}
