package a3_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J5_RadioButton {

	public static void main(String[] args) {

//		Radio button has provide a selectable feature for only one at a time
//		Radio buttons grouped by one same name
//	    Radio button types,
//		with label - arranged by label tag
//		without label - non-arrange structure without using label tag 
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();

		wd.manage().window().maximize();
		wd.navigate().to("https://djangovinoth.pythonanywhere.com/login/");

		WebElement username = wd.findElement(By.id("id_username"));
		username.sendKeys("prabakaran");

		WebElement password = wd.findElement(By.id("id_password"));
		password.sendKeys("Gspraba@23");

		password.submit();

		wd.get("https://djangovinoth.pythonanywhere.com/radiobutton/");
		List<WebElement> radio = wd.findElements(By.name("technology2"));
 
		for(int i=0;i<radio.size();i++){
			String data=radio.get(i).getAttribute("value");
			System.out.println(data);
			if(data.equals("Flask")){
				radio.get(i).click();
			}
		}
	}
}
