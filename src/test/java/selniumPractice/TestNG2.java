package selniumPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG2 {
	
	@Test(priority=3,invocationCount=4,enabled=false)
	public void test()
	{
		System.out.println("this is testng");
		
	}
	@Test(priority=2)
	public void test1()
	{
		System.out.println("this is testng1");
	
	}
	@Test(priority=3)
	public void test2()
	{
		System.out.println("this is testng2");
		
	}
	@Test(priority=1)
	public void test3()
	{
		System.out.println("this is testng3");
		
	}

}
