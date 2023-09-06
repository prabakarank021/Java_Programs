package a9_table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class I9_DynamicTable {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();

		wd.get("https://djangovinoth.pythonanywhere.com/login/");

		WebElement username = wd.findElement(By.id("id_username"));
		username.sendKeys("prabakaran");

		WebElement password = wd.findElement(By.id("id_password"));
		password.sendKeys("Gspraba@23");

		password.submit();

		wd.get("https://djangovinoth.pythonanywhere.com/dynamictable1/");
		wd.findElement(By.id("rows")).sendKeys("10");
		wd.findElement(By.id("cols")).sendKeys("10");
		wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div[1]/div/div[5]/button")).click();
		Thread.sleep(2000);
		WebElement table=wd.findElement(By.name("newtable"));
		
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));

		for (int i = 0; i < rows.size(); i++) {

			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));

			for (int j = 0; j < cols.size(); j++) {
				String data = cols.get(j).getText();
				System.out.print(data + "     ");
			}
			System.out.println();
		} // Static ,Dynamic table
	}
}
