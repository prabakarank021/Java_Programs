package a3_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C9_CheckBox {

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

		wd.get("https://djangovinoth.pythonanywhere.com/checkbox/");
		WebElement element = wd.findElement(By.id("Flask"));
		// element.click();

		if (element.isDisplayed()) {
			System.out.println("Yas element is Displayed");
		}
		if (element.isEnabled()) {
			System.out.println("Yes element is Enabled");
		}
		if (element.isSelected()) {
			System.out.println("Yes element is selected don't click ");
		} else {
			System.out.println("No element is not select, Please click");
			element.click();
		}
	}
}
