package functions.mouseops;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseCopyPaste {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+ "\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	//instance of action class
	Actions act= new Actions(driver);
	driver.findElement(By.xpath("//a[text()*'Create New Account']")).click();
	WebElement usernameInputField=driver.findElement(By.name("firstname"));
	usernameInputField.sendKeys("admin");
	//usernameInputField.sendKeys(Keys.chord(Keys.CONTROL,"a"));
						//or
	act.doubleClick(usernameInputField).perform();
	usernameInputField.sendKeys(Keys.chord(Keys.CONTROL,"c"));
	driver.findElement(By.name("lastname")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}

}
