package selniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel1 {
	
	public WebDriver driver;
	
	@Parameters({"browserName"})
	@BeforeClass
	public void test(String browser)
	{
		if(browser.equals("chrome"))
		{
		driver=new ChromeDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
	}
	@Test
	public void demo()
	{
        driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
	}

}
