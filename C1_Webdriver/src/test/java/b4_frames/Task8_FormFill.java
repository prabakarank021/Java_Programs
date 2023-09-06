package b4_frames;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Task8_FormFill {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://djangovinoth.pythonanywhere.com/simpleform/");

		File f = new File("C:/Batch 256/C1_Webdriver/File/Formfill.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("form");

		Thread.sleep(2000);
		WebElement product = wd.findElement(By.name("product"));
		String data = sheet.getRow(1).getCell(0).getStringCellValue();
		product.sendKeys(data);

		Thread.sleep(2000);
		WebElement mobile = wd.findElement(By.name("mobile"));
		int num =(int) sheet.getRow(1).getCell(1).getNumericCellValue();
		mobile.sendKeys(" "+num+" ");

		Thread.sleep(2000);
		WebElement email = wd.findElement(By.name("email"));
		String mail = sheet.getRow(1).getCell(2).getStringCellValue();
		email.sendKeys(mail);

		Thread.sleep(2000);
		WebElement cetagory = wd.findElement(By.name("cars"));
		String pc = sheet.getRow(1).getCell(3).getStringCellValue();
		Select s = new Select(cetagory);
		s.selectByVisibleText(pc);

		Thread.sleep(2000);
		WebElement quantity = wd.findElement(By.name("points"));
		int count = (int) sheet.getRow(1).getCell(4).getNumericCellValue();
		quantity.sendKeys(count + "");

		Thread.sleep(2000);
		WebElement purchaser = wd.findElement(By.name("purchaser"));
		String name = sheet.getRow(1).getCell(5).getStringCellValue();
		purchaser.sendKeys(name);

		Thread.sleep(2000);
		List<WebElement> gst = wd.findElements(By.name("gst"));
		String gst1 = sheet.getRow(1).getCell(6).getStringCellValue();
		for (int i = 0; i < gst.size(); i++) {
			String data1 = gst.get(i).getAttribute("value");
			if (data1.equals(gst1)) {
				gst.get(i).click();
			}
		}

		Thread.sleep(2000);	
		String mode = sheet.getRow(1).getCell(7).getStringCellValue();
		String mode1=mode.toLowerCase();
		WebElement payment = wd.findElement(By.name(mode1));
		if (payment.isDisplayed()) {
			System.out.println("Yes displayed");
		}
		if (payment.isEnabled()) {
			System.out.println("Yes enabled");
		}
		if (payment.isSelected()) {
			System.out.println("Yes selected");
		} else {
			System.out.println("No not selected");
			payment.click();
		}
		wd.findElement(By.name("button")).click();
		
		Thread.sleep(3000);
		String success=wd.findElement(By.xpath("/html/body/main/div/div/div[1]")).getText();
		System.out.println(success);
		
	}
}