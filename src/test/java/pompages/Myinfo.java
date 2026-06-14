package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.WebDriverutilities;

public class Myinfo {
	
	@FindBy(xpath="//i[@class=\"oxd-icon bi-list oxd-topbar-header-hamburger\"]")
	private WebElement menubtn;
	
	@FindBy(xpath="//a[@class=\"oxd-main-menu-item active toggle\"]")
	private WebElement infobtn;
	
	@FindBy(xpath="(//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"])[1]")
	private WebElement nationalitybtn;
	
	public Myinfo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void menubutton()
	{
		menubtn.click();
	}

	public void infoButton()
	{
		infobtn.click();
	}
	public void nationalityOption()
	{
		WebDriverutilities wu=new WebDriverutilities();
		wu.selectByVisibleText(nationalitybtn, "Indian");
	}

}
