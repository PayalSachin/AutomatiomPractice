package functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOp {

	public static void main(String[] args) {
	String chromeEXE=System.getProperty("user.dir")+"//drivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", chromeEXE);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	//using escape of keyboard to avoid login popup
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
	
	
	}

}
