package genericlib;



	import java.util.Set;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

	public class WebDriverutilities {

	    // Accept Alert
	    public void acceptAlert(WebDriver driver) {
	        Alert a = driver.switchTo().alert();
	        a.accept();
	    }

	    // Dismiss Alert
	    public void dismissAlert(WebDriver driver) {
	        Alert a = driver.switchTo().alert();
	        a.dismiss();
	    }

	    // Get Alert Text
	    public String getAlertText(WebDriver driver) {
	        Alert a = driver.switchTo().alert();
	        return a.getText();
	    }

	    // Switch to Frame
	    public void switchToFrame(WebDriver driver, WebElement frameElement) {
	        driver.switchTo().frame(frameElement);
	    }

	    // Switch Back to Main Page
	    public void switchToDefault(WebDriver driver) {
	        driver.switchTo().defaultContent();
	    }

	    // Switch to Window Based on Title
	    public void switchToWindow(WebDriver driver, String partialTitle) {

	        Set<String> allWindows = driver.getWindowHandles();

	        for (String window : allWindows) {
	            driver.switchTo().window(window);

	            if (driver.getTitle().contains(partialTitle)) {
	                break;
	            }
	        }
	    }

	    // Scroll Down
	    public void scrollDown(WebDriver driver) {

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,500)");
	    }

	    // Scroll to Element
	    public void scrollToElement(WebDriver driver, WebElement ele) {

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", ele);
	    }

	    // JavaScript Click
	    public void jsClick(WebDriver driver, WebElement ele) {

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", ele);
	    }

	    // Mouse Hover
	    public void mouseHover(WebDriver driver, WebElement ele) {

	        Actions act = new Actions(driver);
	        act.moveToElement(ele).perform();
	    }

	    // Right Click
	    public void rightClick(WebDriver driver, WebElement ele) {

	        Actions act = new Actions(driver);
	        act.contextClick(ele).perform();
	    }

	    // Double Click
	    public void doubleClick(WebDriver driver, WebElement ele) {

	        Actions act = new Actions(driver);
	        act.doubleClick(ele).perform();
	    }

	    // Drag and Drop
	    public void dragAndDrop(WebDriver driver,
	                            WebElement source,
	                            WebElement target) {

	        Actions act = new Actions(driver);
	        act.dragAndDrop(source, target).perform();
	    }
	 // Select by Visible Text
	    public void selectByVisibleText(WebElement ele, String text) {
	        Select s = new Select(ele);
	        s.selectByVisibleText(text);
	    }

	 
	
}
