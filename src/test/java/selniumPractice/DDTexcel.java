package selniumPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDTexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		   System.out.println("===================");
		
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Selenium\\excel.xlsx");
		   System.out.println("===================");

           Workbook wb=WorkbookFactory.create(fis);
	     
	     System.out.println("===================");
	     
	     String url=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);

	}

}
