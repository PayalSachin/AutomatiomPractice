package screenShot;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scrrenshot1 {
	public static WebDriver driver= null;
	public static Actions action=null;
	public WebDriverWait wait;
		
	public WebDriver serUp(String browserName, String appUrl) {
		if(browserName.equalsIgnoreCase("chrome")) {
			//use setup method of webdriver manager
			//WebDriverManager.ChromeDriver().setUp();
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			//create an instance of chrome browser
			 driver=new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			// use setup method of WebDriverManager
			// WebDriverManager.firefoxdriver().setup();
			System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			// step2: create an instance of Chrome Browser
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver,20);
		driver.get(appUrl);
		action=new Actions(driver);
		return driver;
		
			
		}
	public void performClick(WebElement element) {
		element.click();
		
		
	}
	public void typeInput(WebElement element,String text) {
		element.clear();
		element.sendKeys("text");
		
	}
	public String getCurrentWorkingDirectory() {
		return System.getProperty("user.dir");
		
	}
	public void copyTextFromField(WebElement element) {
		action.doubleClick(element).perform();
		element.sendKeys(Keys.CONTROL,"c");

	}
	public void pasteTextIntoField(WebElement element) {
		element.sendKeys(Keys.CONTROL,"v");
	
	}
	public void copyPasteText(WebElement textToBeCopied, WebElement textToBePasted) {
		copyTextFromField(textToBeCopied);
		pasteTextIntoField(textToBePasted);
		
	}
	public void waitTillElementIsClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));		
	}
			
	

	public static void main(String[] args) {
    
	}

}
