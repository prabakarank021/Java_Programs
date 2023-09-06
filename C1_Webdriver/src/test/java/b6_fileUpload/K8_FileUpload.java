package b6_fileUpload;
    
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
    
public class K8_FileUpload {
    
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver wd=new EdgeDriver();
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver wd=new ChromeDriver();
		wd.get("https://djangovinoth.pythonanywhere.com/FileUploadDownload/");
		Thread.sleep(2000);
		wd.findElement(By.name("newfile")).sendKeys("C:/Batch 256/C1_Webdriver/Screenshot/amazon.png");
    
	}
}   