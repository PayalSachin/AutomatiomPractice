package functions.mouseops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Museops1 {

	public static void main(String[] args) {
	String chromeExePath=System.getProperty("user.dir")+"drivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", chromeExePath);
	//or
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://demo.automationtesting.in/Register.html");
		WebElement username=	driver.findElement(By.cssSelector("input[Placeholder='First Name']"));
		username.sendKeys("sachin");
		//create an instance of Actions class by passing required browser instance to its constructor
		Actions act=new Actions(driver);
		//with the help of Actions class reference perform appropriate action
		act.moveToElement(username).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		//paste it in last name field
		WebElement lastName=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		act.moveToElement(lastName).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}
}
