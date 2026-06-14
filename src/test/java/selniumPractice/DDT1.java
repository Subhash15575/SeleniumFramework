package selniumPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		Properties p=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Selenium\\properties");
		
		p.load(fis);
		
		
		WebDriver driver = new ChromeDriver();
		driver.get(p.getProperty("url"));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);

	}

}
