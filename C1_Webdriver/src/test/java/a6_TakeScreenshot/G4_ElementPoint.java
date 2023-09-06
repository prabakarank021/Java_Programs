package a6_TakeScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G4_ElementPoint {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");

		WebElement logo = wd.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
		Point point = logo.getLocation();
		System.out.println(point);
		System.out.println(point.x);
		System.out.println(point.y);
	}
}
