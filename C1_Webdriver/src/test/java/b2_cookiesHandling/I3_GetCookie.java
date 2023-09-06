package b2_cookiesHandling;

import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.spi.ThreadContextStack;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class I3_GetCookie {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
//		CookieHandling handled by security Testing team, 
//		security Testing team - They are Functional testers, they will be handling these cookies, we won't handle the cookieHandles, our work we have to say only what type of attack is here,  
//		Basically Cookies is used to enhance the behavior of application
//		getCookies();
//		getCookieNamed(name); - If we know the cookie name we can go with this function
		
		Set<Cookie> c=wd.manage().getCookies();
		Iterator<Cookie> it= c.iterator();
		
		while(it.hasNext()){
			Cookie c1=it.next();
		    System.out.println(c1.getDomain());
		    System.out.println(c1.getName());
		    System.out.println(c1.getPath());
		    System.out.println(c1.getSameSite());
		    System.out.println(c1.getValue());
		    System.out.println(c1.getClass());
		    System.out.println(c1.getExpiry());
		    System.out.println("-----------------");
		    
//		    System.out.println(c1.getDomain()+"---"+c1.getName()+"---"+c1.getPath()+"---"+c1.getSameSite()+"---"+c1.getValue()+"---"+c1.getClass()+"---"+c1.getExpiry());
		    
		}
		
	}
}
