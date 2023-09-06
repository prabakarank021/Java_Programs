package a4_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2_ProductNameRate {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();

		wd.get("https://www.flipkart.com/");
		WebElement into = wd.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		Thread.sleep(2000);
		into.click();

		WebElement search = wd.findElement(By.name("q"));
		search.sendKeys("samsung");
		search.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		
		WebElement model=wd.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[2]"));
		System.out.println(model.getText());
		
		Thread.sleep(2000);
		
		WebElement price=wd.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[3]/div/div[1]"));
		System.out.println(price.getText());
		
		wd.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div")).click();
	
		
//		WebElement model=wd.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[2]"));
//		String name=model.getText();
//		System.out.println(name);
//		
//		WebElement rate=wd.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[3]/div[1]/div"));
//		String data1=rate.getText();
//		System.out.println(data1);
		

	}
}
