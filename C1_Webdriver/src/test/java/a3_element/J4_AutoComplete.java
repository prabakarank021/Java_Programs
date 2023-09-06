package a3_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J4_AutoComplete {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();

		wd.get("https://djangovinoth.pythonanywhere.com/login/");
		WebElement urname = wd.findElement(By.name("username"));
		urname.sendKeys("prabakaran");

		WebElement pass = wd.findElement(By.name("password"));
		pass.sendKeys("Gspraba@23");

		pass.submit();

		wd.get("https://djangovinoth.pythonanywhere.com/autocomplete/");

		WebElement input = wd.findElement(By.id("tags1"));
		input.sendKeys("d");
		
		Thread.sleep(3000);
		String sxp = "/html/body/ul[3]/li[";
		String exp = "]";
		int i = 1;
		while (true) {
			try {
				String fxp = sxp + i + exp;
				i++;
				String data = wd.findElement(By.xpath(fxp)).getText();
				System.out.println(data);
			} catch (Exception e) {
				System.out.println("------------");
				break;
			}
		}
		
//		-----------------------------------------------------------------------------
//		Thread.sleep(2000);
//		List<WebElement> list = wd.findElements(By.tagName("li"));
//
//		String sxp = "/html/body/ul[3]/li[";
//		String exp = "]/div";
//
//		int i = 1;
//		int j=0;
//		while (true) {
//			try {
//				String fxp = sxp + i + exp;
//				WebElement list1 = list.get(j).findElement(By.xpath(fxp));
//				String data = list1.getText();
//				i++;
//				System.out.println(data);
//			} catch (Exception e) {
//				System.out.println("------------");
//				break;
//			}
//		}
		
//	-----------------------------------------------------------------------------------
//		Thread.sleep(2000);
//		List<WebElement> list = wd.findElements(By.tagName("li"));
//		int i = 0;
//		while (true) {
//			try {
//				List<WebElement> list1 = list.get(i).findElements(By.tagName("div"));
//				String data = list1.get(i).getText();
//				System.out.println(data);
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("----------------");
//				break;
//			}
//		}
	}
}
