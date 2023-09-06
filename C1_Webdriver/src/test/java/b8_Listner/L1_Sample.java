package b8_Listner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L1_Sample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		
//		Listener - To perform action oriented debugging 
//		Why listener monitor the webDriver actions - To identify i run a program for ten hours. i get 30 error, which 30 elements got failed, why elements got failed, to check when elements got failed.  
//		WebDriver            - To perform the actions
//		EventFiringWebDriver - To monitor the webDriver actions
//		Listener             - To log the monitored action
		
		EventFiringWebDriver efwd=new EventFiringWebDriver(wd);
		L2_OwnListener listener=new L2_OwnListener();
		efwd.register(listener);
		
		efwd.manage().window().maximize();
//		System.out.println("Pre - Going to enter url");
		efwd.navigate().to("https://www.google.co.in/");
//		System.out.println("Post - Enter url completed");
		WebElement input=efwd.findElement(By.name("q"));
		input.sendKeys("chennai");
		input.submit();
		Thread.sleep(2000);
		efwd.navigate().back();
		Thread.sleep(2000);
		efwd.navigate().forward();
		Thread.sleep(2000);
		efwd.navigate().back();
		Thread.sleep(2000);
		efwd.navigate().forward();
		Thread.sleep(2000);
		efwd.navigate().refresh();
		Thread.sleep(2000);
		efwd.quit();
		
	}
}
