package b9_wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L4_ImplicitWait {

	public static void main(String[] args) {
		
//		WebDriver wait for a certain of time before throwing a exception
//      Static wait - Thread.sleep(2000);
//      Dynamic Wait - Three types
//		ImplicitWait - It checks only may or may not present element in particular time frame - If we give to implicitWait to webDriver wait for 10 seconds, It move to the next step immediately when element was found by below 10 second, if any error was appear it took max 10 second constantly, then it shows error. 
//		ExplicitWait - It checks all the condition which i gave in certain time - ExplicitWait Scenario, To check the element condition more (conditionally correct and check element present) take high time 
//		FluentWait
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement input=wd.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
	    input.sendKeys("chennai");
	    input.submit();
	}
}
