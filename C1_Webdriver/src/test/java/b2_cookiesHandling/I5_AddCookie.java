package b2_cookiesHandling;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class I5_AddCookie {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
//		clear
		wd.manage().deleteAllCookies();
		
//		add
		Cookie myowncookie =new Cookie("Company", "Vcentry");
		wd.manage().addCookie(myowncookie);
		
//		get
		Set<Cookie> c=wd.manage().getCookies();
		Iterator<Cookie> it= c.iterator();
		
		while(it.hasNext()){
			Cookie s=it.next();
		    System.out.println(s.getDomain());
		    System.out.println(s.getName());
		    System.out.println(s.getPath());
		    System.out.println(s.getSameSite());
		    System.out.println(s.getValue());
		    System.out.println(s.getClass());
		    System.out.println(s.getExpiry());
			    
		}
		System.out.println("Cookie cleared");
	}
}
