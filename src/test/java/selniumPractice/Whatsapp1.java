package selniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Whatsapp1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.findElement(By.xpath("//span[text()='Continue']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		

		// Wait until the chat is available
		wait.until(ExpectedConditions.elementToBeClickable(
		        By.xpath("//span[@title='Pankaj ucer']"))).click();

		for (int i = 1; i <= 10; i++) {

		    WebElement msgBox = wait.until(
		            ExpectedConditions.visibilityOfElementLocated(
		                    By.xpath("//p[@dir='auto']")));

		    msgBox.sendKeys("Hi Bro! Message " + i);

		    wait.until(ExpectedConditions.elementToBeClickable(
		            By.xpath("//span[@data-testid='wds-ic-send-filled']"))).click();

		    Thread.sleep(1000);
		}

	}

}
