package selniumPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//select[@name=\"dropdown-class-example\"]"));
		Thread.sleep(2000);
		//ele.click();
		
		Select s=new Select(ele);
		Thread.sleep(2000);
		s.selectByIndex(2);
		Thread.sleep(2000);
		//s.selectByValue("1");
		Thread.sleep(2000);
		s.selectByVisibleText("Option3");
		
		Thread.sleep(2000);
		
		List<WebElement> allopt = s.getOptions();
		System.out.println(allopt.size());
		
		ArrayList a=new ArrayList();
		
		for(WebElement t:allopt)
		{
			String text=t.getText();
			System.out.println(text);
			a.add(text);
		}
		
		System.out.println(s.isMultiple());
		
		System.out.println("*************after shorting**********");
		
		Collections.sort(a);
		
		for(Object opt:a)
		{
			System.out.println(opt);
		}
		
		
		
		
		
		
		
	}

}
