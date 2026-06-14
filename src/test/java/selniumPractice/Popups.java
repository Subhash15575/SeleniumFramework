package selniumPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice-automation.com/popups/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//b[text()=\"Alert Popup\"]")).click();
		
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		
	    a.accept();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//b[text()=\"Confirm Popup\"]")).click();
	    Thread.sleep(2000);
	    a.accept();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//b[text()=\"Confirm Popup\"]")).click();
	    Thread.sleep(2000);
	    a.dismiss();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//b[text()=\"Prompt Popup\"]")).click();
	    Thread.sleep(2000);
	    a.sendKeys("Subhash");
	    Thread.sleep(2000);
	    a.accept();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//b[text()=\"Prompt Popup\"]")).click();
	    Thread.sleep(2000);
	    a.sendKeys("Chandra");
	    Thread.sleep(2000);
	    a.dismiss();
	    Thread.sleep(2000);
	    
	    

	}

}
