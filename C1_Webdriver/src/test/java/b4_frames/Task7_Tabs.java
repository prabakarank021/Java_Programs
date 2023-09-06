package b4_frames;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task7_Tabs {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver wd = new EdgeDriver();
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver wd = new ChromeDriver();
		wd.get("https://djangovinoth.pythonanywhere.com/tabs/");

		String java="//*[@id='tabs1']/ul/li[2]";
		String python="//*[@id='tabs1']/ul/li[3]";
		String Vcentry="//*[@id='tabs1']/ul/li[1]";
		
		WebElement move = wd.findElement(By.xpath(python));
		Actions a = new Actions(wd);
		a.moveToElement(move).build().perform();
		String at = move.getAttribute("aria-controls");
		WebElement input = wd.findElement(By.id(at));
		Thread.sleep(2000);
		List<WebElement> data = input.findElements(By.tagName("p"));
		System.out.println(data.size());
		Thread.sleep(2000);
		for (int i = 0; i < data.size(); i++) {
			String data1 = data.get(i).getText();
			System.out.println(data1);
		}

	}
	
}
