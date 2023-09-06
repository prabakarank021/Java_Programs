package b4_frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J8_FrameWebelement {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();

		wd.get("https://jqueryui.com/tooltip/");

		List<WebElement> frames = wd.findElements(By.tagName("iframe"));
		wd.switchTo().frame(frames.get(0));

		WebElement input = wd.findElement(By.id("age"));
		input.sendKeys("10");
		wd.switchTo().defaultContent();
		// wd.switchTo().parentFrame();
		wd.findElement(By.linkText("Draggable")).click();

	}
}
