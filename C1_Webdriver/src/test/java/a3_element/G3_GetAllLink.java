package a3_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G3_GetAllLink {

	public static void main(String[] args) {
	
			WebDriverManager.chromedriver().setup();
			WebDriver wd=new ChromeDriver();
			
			wd.manage().window().maximize();
			wd.navigate().to("https://www.google.com/");
			
			List<WebElement> w=wd.findElements(By.tagName("a"));

			for (int i = 0; i < w.size(); i++) {
				String data = w.get(i).getText();
				if (!data.isEmpty()) {
					System.out.println(data);
				}
			}		
	}
}
