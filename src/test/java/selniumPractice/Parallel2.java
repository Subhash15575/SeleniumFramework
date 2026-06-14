package selniumPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Parallel2 {
	
	

	

	    WebDriver driver;

	    @Parameters("browserName")
	    @BeforeClass
	    public void launchBrowser(String browser) {

	        if (browser.equalsIgnoreCase("chrome")) {
	            driver = new ChromeDriver();
	        } else if (browser.equalsIgnoreCase("edge")) {
	            driver = new EdgeDriver();
	        }
	    }

	    @Test
	    public void openAmazon() {

	        driver.get("https://www.amazon.in");
	        driver.manage().window().maximize();

	        System.out.println("Title: " + driver.getTitle());
	    }
	

}

