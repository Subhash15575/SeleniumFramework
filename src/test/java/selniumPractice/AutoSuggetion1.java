package selniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("APjFqb")).sendKeys("seleni");
		
		/*
		List<WebElement> s = driver.findElements(By.xpath("//span[contains(text(),'seleni')]"));
		
		System.out.println(s.size());
		
		for(WebElement a:s)
		{
			System.out.println(a.getText());
		}
		*/
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("APjFqb"));
		ele.clear();
		System.out.println(ele.getSize());
		System.out.println(ele.getLocation());
		 Point d = ele.getLocation();
		 int x=d.getX();
		 int y=d.getY();
		 System.out.println(x);
		 System.out.println(y);
		System.out.println(ele.getRect());
		System.out.println(ele.getAttribute("id"));
		System.out.println(ele.getCssValue("color"));
		System.out.println(ele.isDisplayed());
		System.out.println(ele.isEnabled());
		System.out.println(ele.isSelected());
		/*
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys("Gandhi");
		Thread.sleep(2000);
		String t = driver.findElement(By.id("APjFqb")).getTagName();
		System.out.println(t);
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).submit();
		*/
		
		WebElement el2=driver.findElement(By.id("hplogo"));
		System.out.println(el2.getCssValue("color"));
		
		

	}

}
