package a2_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C4_AbsolutePath {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		
		wd.manage().window().maximize();
		wd.navigate().to("https://www.google.com/");

//		Absolutepath - /html/body/.....
//		Relativepath - .//  
//		. means current directory or current location
//		.. means parent directory or parent location 
		
		WebElement element=wd.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		element.sendKeys("Chennai");
		
	}
}
