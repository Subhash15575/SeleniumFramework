package selniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatsapp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubWebDriver driver=new ChromeDriver();
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		
		driver.findElement(By.xpath("//span[@title=\"Pankaj ucer\"]")).click();
		
		WebElement ele=driver.findElement(By.xpath("//p[@class=\"selectable-text copyable-text x15bjb6t x1n2onr6\"]"));
		
		int i=1;
		while(i<100) {
			//WebElement ele = driver.findElement(By.xpath("//p[@dir=\"auto\"]"));
			ele.sendKeys("hi bro you are good to go on youtube channel");
			driver.findElement(By.xpath("//span[@data-testid=\"wds-ic-send-filled\"]")).click();
			System.out.println("this is great");
			Thread.sleep(3000);
			
			i++;
		}
		
		
		
	}

}
