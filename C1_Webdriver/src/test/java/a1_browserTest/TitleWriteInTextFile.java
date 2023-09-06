package a1_browserTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TitleWriteInTextFile {

     public static void main(String[] args) throws IOException, InterruptedException {
		
    	 WebDriverManager.chromedriver().setup();
    	 WebDriver wd = new ChromeDriver();
    	 
    	 wd.manage().window().maximize();
    	 wd.navigate().to("https://www.facebook.com/");
    	 
    	 String title=wd.getTitle();
    	 Thread.sleep(2000);
    	 
    	 File f=new File("C:/Batch 256/C1_Webdriver/File/browsertitle.txt");
    	 FileWriter fw=new FileWriter(f);
    	 BufferedWriter bw=new BufferedWriter(fw);
    	 
    	 bw.write(title);
    	 bw.close();
    	 
    	 wd.close();
	}
}
