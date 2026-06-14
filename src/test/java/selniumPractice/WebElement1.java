package selniumPractice;

import java.time.Duration;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElement1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		
		String p = driver.getTitle();
		System.out.println(p);
		
		String u = driver.getCurrentUrl();
		System.out.println(u);
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		Boolean e = w.until(ExpectedConditions.titleContains("OrangeHRM1"));
		
		System.out.println(e);
		
		if(p.equals("OrangeHRM1"))
		{
			System.out.println("verification done dedo");	
		}
		else
		{
			System.out.println("verification failed");
		}
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		

	}

}
