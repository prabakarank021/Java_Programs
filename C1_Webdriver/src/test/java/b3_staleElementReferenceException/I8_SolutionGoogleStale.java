package b3_staleElementReferenceException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class I8_SolutionGoogleStale {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();

		wd.manage().window().maximize();
		wd.navigate().to("https://www.google.com/");

//		we can handle the StaleElementReferenceException by element re-identification with help of try catch, we can't handle this exception by using try catch only

//		wd.findElement(By.name("q")).sendKeys("Chennai");
//		wd.findElement(By.name("q")).submit();  //First solution

		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("Chennai");
		input.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		wd.navigate().back();
		WebElement input1 = wd.findElement(By.name("q")); // second solution
		input1.sendKeys("Guindy");
		input1.sendKeys(Keys.ENTER);

	}
}
