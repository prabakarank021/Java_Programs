package a1_browserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_OpenBrowser {

	public static void main(String[] args) {
		
//		WebDriverManager - This is used to get permission to open a chrome browser
		
		WebDriverManager.chromedriver().setup(); // Initialization of chrome browser
		
//		new ChromeDriver();
		
//function a,b,c,d          a,b,c,d
		ChromeDriver c=new ChromeDriver(); //We try to map with chromeDriver its shows unwanted functions also. That's why we always map with webDriver to avoid unwanted functions 
//		a
//		b
//		c
//		d
		
//function a,b,c          a,b,c,d	
	    WebDriver wd=new ChromeDriver(); //WebDriver is common for all web browsers thats why we use webDriver interface to map this situation and also we can avoid some unwanted function. This is the advantage of mapping with webDriver interface  
//	    a
//	    b
//	    c
	}
}    
