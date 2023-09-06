package b8_Listner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class L2_OwnListener extends AbstractWebDriverEventListener{

//  WebDriverEventListener - This is interface of listenerEvent 
//	AbstractWebDriverEventListener - This is created to Implementation class of WebDriverEventListener interface - This is contain the all written functions of listenerEvent 

	
	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---afterAlertAccept---");
	}

	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---afterAlertDismiss---");
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		System.out.println("---afterChangeValueOf---");
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---afterClickOn---");
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---afterFindBy---");
	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		System.out.println("---afterGetScreenshotAs---");
	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		System.out.println("---afterGetText---");
	}

	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---afterNavigateBack---");
	}

	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---afterNavigateForward---");
	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---afterNavigateRefresh---");
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---afterNavigateTo---");
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---afterScript---");
	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---afterSwitchToWindow---");
	}

	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---beforeAlertAccept---");
	}

	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---beforeAlertDismiss---");
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		System.out.println("---beforeChangeValueOf---");
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---beforeClickOn---");
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---beforeFindBy---");
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		System.out.println("---beforeGetScreenshotAs---");
	}

	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---beforeGetText---");
	}

	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---beforeNavigateBack---");
	}

	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---beforeNavigateForward---");
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---beforeNavigateRefresh---");
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---beforeNavigateTo---");
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---beforeScript---");
	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---beforeSwitchToWindow---");
	}

	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("---onException---");
	}
}
