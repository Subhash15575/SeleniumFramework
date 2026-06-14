package selniumPractice;

import java.time.Duration;

import org.jspecify.annotations.NonNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
	     Thread.sleep(2000);
		Boolean p = w.until(ExpectedConditions.titleContains("amazon"));
		
		System.out.println(p);
		
		
		
		

	}

}
