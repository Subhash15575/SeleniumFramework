package selniumPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CrossbrowserRunTimePoli {
	
	
	public static void test(WebDriver driver)
	{
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
	}
	
	public static void main(String[] args) {
		
		CrossbrowserRunTimePoli.test(new ChromeDriver());
		
		CrossbrowserRunTimePoli.test(new EdgeDriver());
		
		
	}
	
	

}
