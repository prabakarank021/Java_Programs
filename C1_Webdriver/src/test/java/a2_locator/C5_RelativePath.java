package a2_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C5_RelativePath {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		
		wd.manage().window().maximize();
		wd.navigate().to("https://www.bing.com/");

//		Absolutepath - /html/body/.....
//		Relativepath - .//
		
		WebElement element=wd.findElement(By.xpath(".//*[@id='sb_form_q']")); // You can't use inside the double quote another double quote, Same wise single quote also but you can use single quote inside the double quote, same wise you can use double quotes inside the single quotes
		element.sendKeys("Chennai");   //We can use like this ("Hi'123'welcome") , ('hi"123"welcome')
		                               //But you can't use like this ("Hi"123"welcome") , ('Hi'123'welcome')
	}
}
