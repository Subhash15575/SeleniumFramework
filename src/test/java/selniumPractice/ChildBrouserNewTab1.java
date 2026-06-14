package selniumPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrouserNewTab1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		
		

	}

}
