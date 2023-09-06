package a6_TakeScreenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G3_Screenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		
//		WebDriver        - interface
//		TakesScreenshot  - interface - we are cast the two interfaces because we can't create objects for an interface. 
		
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE); 
		File dst=new File("C:/Batch 256/C1_Webdriver/Screenshot/google.png");
		FileHandler.copy(src, dst); // it comes After the 3.4 version in selenium 
	}
}
 