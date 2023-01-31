package switching;

import javax.swing.Spring;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class Switch1 {
	static WebDriver driver;

	public static void main(String[] args) {
		SeleniumUtility util = new SeleniumUtility();
		driver = util.setUp("chrome", "https://demo.actitime.com/login.do");
		// verify bydefault mouse poitner is present in username field
		WebElement element = driver.switchTo().activeElement();
		String exp = element.getAttribute("placeholder");
		if (exp.equals("Username")) {
			System.out.println("Mouse pointer is in username field");
		}
		//perform accesibility testing for login functionality
		element.sendKeys(Keys.TAB);
		// verify by default mouse pointer is present in username input field
		WebElement element1= driver.switchTo().activeElement();
		String exp1=element.getAttribute("placeholder");
		if(exp1.equals("password")) {
			System.out.println("Mouse pointer is in password field");
			// after pressing Tab button control will move to password input field
			element1.sendKeys("manager", Keys.ENTER);
			
		}
	}

}
