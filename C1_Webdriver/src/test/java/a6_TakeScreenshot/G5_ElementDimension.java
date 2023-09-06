package a6_TakeScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G5_ElementDimension {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		
		WebElement logo=wd.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
		Dimension d= logo.getSize();
		System.out.println(d);
		System.out.println(d.height);
		System.out.println(d.width);
		
	}
}
