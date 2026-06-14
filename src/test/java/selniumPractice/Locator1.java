package selniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("APjFqb")).sendKeys("Seleni");
		Thread.sleep(2000);
		//driver.findElement(By.name("btnK")).click();
		
		//driver.findElement(By.className("gLFyf")).sendKeys("seleni");
		
		//driver.findElement(By.tagName("textarea")).sendKeys("subh");
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//driver.findElement(By.cssSelector("textarea[jsname=\"yZiJbe\"]")).sendKeys("Gandhi");
		
		//xpath by attribute
		
		//driver.findElement(By.xpath("//textarea[@jsname=\"yZiJbe\"]")).sendKeys("bomani");
		
		
		// xpath by test()
		
		//driver.findElement(By.xpath("//span[text()='Forgotten password?']")).click();
		
		//xpath by contains of attribute
		
		//driver.findElement(By.xpath("(//span[contains(@class,'x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft')])[2]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//input[contains(@value,'Google Search')])[2]")).submit();
		
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		//Thread.sleep(10000);
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		//Thread.sleep(10000);
        //driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
		//xpath by contains of test()
		
		//driver.findElement(By.xpath("//span[contains(text(),'Forgotten')]")).click();
		
		//driver.findElement(By.id("twotabsearchtextbox"));
		
		//driver.findElement(By.xpath("(//a[text()='Mobiles'])[1]")).click();
		
		//driver.navigate().back();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("(//span[@class='nav-line-2'])[3]")).click();
		
		
		

	}

}
