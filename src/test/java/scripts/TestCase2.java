package scripts;

import org.testng.annotations.Test;

import genericlib.StepGroup;
import pompages.Myinfo;
import pompages.OrangeHRMLogin;

public class TestCase2 extends StepGroup {
	
	
	@Test
	public void ifo() throws InterruptedException
	{
		
		System.out.println("this is pass");
		/*
		OrangeHRMLogin o=new OrangeHRMLogin(driver);
		Thread.sleep(2000);
		o.userName("Admin");
		Thread.sleep(2000);
		o.password("admin123");
		Thread.sleep(2000);
		o.login();
		Thread.sleep(2000);
		
		
	Myinfo m=new Myinfo(driver);
     m.menubutton();
     Thread.sleep(2000);
	 m.infoButton();
	 Thread.sleep(2000);
	 m.nationalityOption();
	 Thread.sleep(2000);
	 */
	}
}
