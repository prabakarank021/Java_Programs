package b6_fileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task6 {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver wd=new EdgeDriver();
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver wd=new ChromeDriver();
		
		wd.get("https://djangovinoth.pythonanywhere.com/FileUploadDownload/");
		WebElement input=wd.findElement(By.name("newfile"));
//		input.click();
//	    JavascriptExecutor jse=(JavascriptExecutor)wd;
//	    jse.executeScript("arguments[0].click()",input);
	    Actions a=new Actions(wd);
	    a.click(input).build().perform();
	}
}
