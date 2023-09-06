package a3_element;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J3_ReadMultipleElementText {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();

		wd.manage().window().maximize();
		wd.get("https://djangovinoth.pythonanywhere.com/login/");

		WebElement username = wd.findElement(By.id("id_username"));
		username.sendKeys("prabakaran");

		WebElement password = wd.findElement(By.id("id_password"));
		password.sendKeys("Gspraba@23");

		password.submit();

		wd.get("https://djangovinoth.pythonanywhere.com/SingleAndMultiImage/");
		String sxp = "/html/body/main/div/div[2]/div/div[2]/div/div/div/div[";
		String exp = "]/div/div/p";

		int i = 1;
		while (true) {
			try {
				String fxp = sxp + i + exp;
				i++;
				String data = wd.findElement(By.xpath(fxp)).getText();
				System.out.println(data);
			} catch (Exception e) {
                   System.out.println("Unable to locate the element");
                   break;
			}

		}
	}
}
