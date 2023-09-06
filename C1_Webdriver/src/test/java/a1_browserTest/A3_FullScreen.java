package a1_browserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A3_FullScreen {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		
		wd.manage().window().fullscreen();
		
//		maximize - Change the window to the max size 
//		fullScreen - It hiding the whole address bar,header,tab also
		
	}
}
