package a1_browserTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetExcelUrl {

	public static void main(String[] args) throws IOException {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver wd=new ChromeDriver();
		
		WebDriverManager.edgedriver().setup();
		WebDriver wd=new EdgeDriver();
		
		File f=new File("C:/Batch 256/C1_Webdriver/File/Automation.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("url");
		String url=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(url);
		wd.navigate().to(url);
		
		String title=wd.getTitle();
		System.out.println(title);
        XSSFSheet sheet1=wb.createSheet(title+"");
		
        String page=wd.getPageSource();
        
		XSSFRow row=sheet1.createRow(0);
		XSSFCell cell=row.createCell(0);
		cell.setCellValue(title); // We can't print  the pageSource in one cell because maximum length of cell contents (text) is 32767 characters
		
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		fos.close();
		
//		The maximum length of cell contents (text) is 32767 characters
		
	}
}
