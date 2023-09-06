package a4_actions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task3_ChennaiSplit {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
        wd.manage().window().maximize();
		
        wd.get("https://en.wikipedia.org/wiki/Chennai");
        WebElement paragraph=wd.findElement(By.xpath("/html/body/div[1]/div/div[3]/main/div[2]/div[3]/div[1]/p[4]"));
        String data=paragraph.getText();
        
        if(data.contains("Chennai")){
        	System.out.println("Yes chennai word is appear in this paragraph");
        }
       
        String[] a= data.split(" ");
        int count=0; 
        for(int i=0;i<a.length;i++){
        	if(a[i].equals("Chennai")){
        		count++;
        	}
        }
        
        System.out.println("Count of chennai is - "+count); 
        
        System.out.println(data);
        System.out.println(data.replace("Chennai", "Madras"));
        Thread.sleep(2000);
        wd.close();
	}
}
