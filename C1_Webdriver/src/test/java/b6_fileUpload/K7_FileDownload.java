package b6_fileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class K7_FileDownload {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.get("https://djangovinoth.pythonanywhere.com/FileUploadDownload/");
		wd.findElement(By.linkText("Click Here")).click();		
	
	}
}
