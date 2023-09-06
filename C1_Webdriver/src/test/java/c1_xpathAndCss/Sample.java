package c1_xpathAndCss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver wd=new ChromeDriver();
//		wd.get("https://accounts.google.co.in");
//		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
//		
//		wd.findElement(By.xpath(".//input[@name='identifier']")).sendKeys("prabak2321@gmail.com");;
//		wd.findElement(By.xpath(".//input[@name='identifier']")).sendKeys(Keys.ENTER);
//		wd.findElement(By.name("Passwd")).sendKeys("Gspraba@23");
//		wd.findElement(By.name("Passwd")).sendKeys(Keys.ENTER);
//		String actual=wd.findElement(By.xpath(".//h1[@class='XY0ASe']")).getText();
//		System.out.println(actual);
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.google.com/search?client=firefox-b-d&q=google");
	}
	
}
