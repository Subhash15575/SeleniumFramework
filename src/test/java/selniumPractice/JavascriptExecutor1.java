package selniumPractice;

import java.awt.event.WindowStateListener;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//js.executeScript("window.scrollBy(0,500)");
		
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='JMeter']"));
		Point p=ele.getLocation();
		int x=p.getX();
		int y=p.getY();
		System.out.println(x);
		System.out.println(y);
		
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
		//ele.click();
		js.executeScript("arguments[0].click();",ele);
		

	}

}
