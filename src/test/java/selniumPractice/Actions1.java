package selniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("(//button[@class=\"nav-flyout-button nav-icon nav-arrow\"])[2]"));
        Actions a=new Actions(driver);
        Thread.sleep(2000);
        a.moveToElement(ele).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Your Orders']")).click();
	}

}
