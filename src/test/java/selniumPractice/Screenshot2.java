package selniumPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot2 {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	TakesScreenshot tsc =(TakesScreenshot)driver;//downcasting
	File src = tsc.getScreenshotAs(OutputType.FILE);
	//File src=driver.findElement(By.xpath("//img[@id=\"hplogo\"]")).getScreenshotAs(OutputType.FILE);
	File dst =new File("./googleimg.png");
	//FileUtils.copyFile(src,dst);
	Files.copy(src, dst);
}
}
