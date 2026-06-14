package scripts;

import org.testng.annotations.Test;

import genericlib.StepGroup;
import pompages.OrangeHRMLogin;

public class TestCase1 extends StepGroup {
	
	@Test(priority=4)
	public void tc1() throws InterruptedException
	{
	OrangeHRMLogin o=new OrangeHRMLogin(driver);
	Thread.sleep(2000);
	o.userName("Admin");
	Thread.sleep(2000);
	o.password("admin123");
	Thread.sleep(2000);
	o.login();
	Thread.sleep(2000);
	}
	/*
	@Test(priority=1)
	public void tc2() throws InterruptedException
	{
	OrangeHRMLogin o=new OrangeHRMLogin(driver);
	Thread.sleep(2000);
	o.userName("Admin");
	Thread.sleep(2000);
	o.password("admin1232");
	Thread.sleep(2000);
	o.login();
	Thread.sleep(2000);
	}
	@Test(priority=2)
	public void tc3() throws InterruptedException
	{
	OrangeHRMLogin o=new OrangeHRMLogin(driver);
	Thread.sleep(2000);
	o.userName("Admin1");
	Thread.sleep(2000);
	o.password("admin123");
	Thread.sleep(2000);
	o.login();
	Thread.sleep(2000);
	}
	@Test(priority=3)
	public void tc4() throws InterruptedException
	{
	OrangeHRMLogin o=new OrangeHRMLogin(driver);
	Thread.sleep(2000);
	o.userName("Admin1");
	Thread.sleep(2000);
	o.password("admin1234");
	Thread.sleep(2000);
	o.login();
	Thread.sleep(2000);
	}
	*/

}
