package a5_dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G2_JavaSelectedByValue {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();

		wd.navigate().to("https://djangovinoth.pythonanywhere.com/login/");

		WebElement username = wd.findElement(By.id("id_username"));
		username.sendKeys("prabakaran");

		WebElement password = wd.findElement(By.id("id_password"));
		password.sendKeys("Gspraba@23");

		password.submit();

		wd.get("https://djangovinoth.pythonanywhere.com/dropdown/");
        WebElement dropdown=wd.findElement(By.id("month1"));
	
//        Select s=new Select(dropdown);
        List<WebElement> s=dropdown.findElements(By.tagName("option"));
        
        System.out.println(s.get(0).getText());
        
        String input="08";
        
        for(int i=0;i<s.size();i++){
        	String data=s.get(i).getAttribute("Value");
        	if(data.equals(input)){
        		s.get(i).click();
        		break;
        	}
        }
        
	}
}
