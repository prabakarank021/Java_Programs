package a3_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D2_GetAttribute {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();

		wd.manage().window().maximize();
		wd.navigate().to("https://www.bing.com/");

		WebElement element = wd.findElement(By.name("q"));
		element.sendKeys("Chennai");

//		String data=element.getText(); // <input value="Chennai"> </input> - This line output is (Your input is ) why because getText function is to get a text in between open and close tag in this case there is nothing between the open and close tag 
//		System.out.println("Your input is "+data);
		
		String data=element.getAttribute("value"); //<input value="Chennai"> </input>, In this case value is an attribute maybe more attribute also allowed in one tag
		System.out.println(data);
	}

}
