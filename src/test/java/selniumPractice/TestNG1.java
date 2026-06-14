package selniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test(priority=3,invocationCount=4)
	public void test()
	{
		System.out.println("this is testng");
		Reporter.log("test",true);
	}
	@Test(priority=2)
	public void test1()
	{
		System.out.println("this is testng1");
		Reporter.log("test1",true);
	}
	@Test(priority=3)
	public void test2()
	{
		System.out.println("this is testng2");
		Reporter.log("test2",true);
	}
	@Test(priority=1,enabled=false)
	public void test3()
	{
		System.out.println("this is testng3");
		Reporter.log("test3",true);
	}
	
}
