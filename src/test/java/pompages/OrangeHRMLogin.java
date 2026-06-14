package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLogin {
	
	@FindBy(name="username")
	private WebElement uname;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement loginbtn;
	
	public OrangeHRMLogin(WebDriver driver)
	{
	
	PageFactory.initElements(driver, this);
	}
	
	public void userName(String user)
	{
		uname.sendKeys(user);
	}
	public void password(String passw)
	{
		pwd.sendKeys(passw);
	}
	public void login()
	{
		loginbtn.click();
	}

}
