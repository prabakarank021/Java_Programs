package a6_TakeScreenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task4_FlipkartSS {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com/");
		
		wd.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		WebElement im=wd.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[3]/div/div/div[2]/div/div/div[1]/div/div[1]/div/a/div[1]/div/img"));
		
		JavascriptExecutor jse=(JavascriptExecutor)wd;
		jse.executeScript("arguments[0].scrollIntoView(true)", im);
		
		WebElement ima=wd.findElement(By.xpath("/html/body/div/div/div[3]/div[4]/div/div[2]/div/div/div[1]/div/div[3]/div/a/div[1]/div/img"));
		Point point=ima.getLocation();
		Dimension dimension=ima.getSize();
		
		int x=point.x;
		int y=point.y;
		int height=dimension.height;
		int width= dimension.width;
		
		
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		BufferedImage copy=ImageIO.read(src);
		BufferedImage crop=copy.getSubimage(x, y, width, height);
		ImageIO.write(crop, "png", src);
		
		File dst=new File("C:/Batch 256/C1_Webdriver/Screenshot/flipkart.png");
		FileHandler.copy(src, dst);
	}
}
