package a6_TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G7_WebElemetCrop {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		
		WebElement logo=wd.findElement(By.id("ctaCanvas"));
		
		File src=((TakesScreenshot)logo).getScreenshotAs(OutputType.FILE); // ElementScreenshot is allow after selenium 4.0
		File dst=new File("C:/Batch 256/C1_Webdriver/Screenshot/webelecrop.png");
		FileHandler.copy(src, dst);
		
//		robotClass screenshot is print full screen along with a timeStamp. But we don't prefer that.
	}
}
