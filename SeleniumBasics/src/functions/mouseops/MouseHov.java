package functions.mouseops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHov {

	public static void main(String[] args) {

		WebDriver driver=setUp("chrome", "https://www.facebook.com/");
		/* Instance of Action Class */
		Actions action=new Actions(driver);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement userNameInputField=driver.findElement(By.name("firstname"));
		userNameInputField.sendKeys("admin");
		//userNameInputField.sendKeys(Keys.chord(Keys.CONTROL,"a"));
				//or
		action.doubleClick(userNameInputField).perform();
		userNameInputField.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.name("lastname")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}
	public static WebDriver setUp(String BrowserName, String appUrl) {
		WebDriver driver= null;
		if(BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(BrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		return driver;
	}

}
