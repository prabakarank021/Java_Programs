package a6_TakeScreenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G6_Crop {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		Thread.sleep(2000);
		
		WebElement logo=wd.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
		Dimension dimension= logo.getSize();
		Point point=logo.getLocation();
		
		int height=dimension.height;
		int width=dimension.width;
		int x=point.x;
		int y=point.y;
		
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE); // Original screenshot
//		crop
		BufferedImage copy=ImageIO.read(src); //ImageIO - JavaExtenstion (Javax) version, copy screenshot
		BufferedImage crop=copy.getSubimage(x, y, width, height); //BufferedImage is temporary image
		ImageIO.write(crop, "png", src);
		
		FileHandler.copy(src, new File("C:/Batch 256/C1_Webdriver/Screenshot/crop.png"));
	}
}
