package softsuaveInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftSuave_1 {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver wd= new FirefoxDriver();
		wd.get("https://www.google.com/");
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement search=wd.findElement(By.name("q"));
		search.sendKeys("Water Bottle");
		search.submit();
		
	}
	
}
