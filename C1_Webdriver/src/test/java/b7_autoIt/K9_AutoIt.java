package b7_autoIt;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class K9_AutoIt {

	public static void main(String[] args) throws InterruptedException, IOException {
		
//		We can handle window specific component through autoit, robot class, sikuli tools.
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.get("https://djangovinoth.pythonanywhere.com/FileUploadDownload/");
		WebElement em=wd.findElement(By.name("newfile"));
	    Actions a=new Actions(wd);
	    a.click(em).build().perform();
		Thread.sleep(5000);
		
//		Runtime.getRuntime().exec("exe file path");
		Runtime.getRuntime().exec("cmd");
	}
}
	