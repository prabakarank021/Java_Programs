package a6_TakeScreenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.WebDriverEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task5_AmazonSS {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.amazon.in/");
		
		WebElement image=wd.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div[2]/a/div[1]/img"));
		Point point=image.getLocation();
		Dimension dimension=image.getSize();
		
		int x=point.x;
		int y=point.y; 
		int h=dimension.height;
		int w=dimension.width;
		
		File src= ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		BufferedImage copy= ImageIO.read(src);
		BufferedImage crop= copy.getSubimage(x, y, w, h);
		ImageIO.write(crop, ".png", src);
		FileUtils.copyFile(src, new File("C:\\Batch 256\\C1_Webdriver\\Screenshot\\amazon.png"));
		FileHandler.copy(src, new File("C:\\Batch 256\\C1_Webdriver\\Screenshot\\amazon.png"));
	}
}
