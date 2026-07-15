package selniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frame1 {
	
	@Test
	public void test() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/iframes");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Support']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//WebElement ele = driver.findElement(By.xpath("//span[@class=\"new-topic-btn__icon\"]"));
		//Point p=ele.getLocation();
		//System.out.println(p);
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//iframe[@src=\" https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true\"]"));
		driver.switchTo().frame(ele);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class=\"AB7Lab Id5V1\"])[1]")).click();
	}

}
