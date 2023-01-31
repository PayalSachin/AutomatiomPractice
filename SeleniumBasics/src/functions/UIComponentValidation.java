package functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIComponentValidation {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe" );
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://demo.automationtesting.in/Register.html");
	//identify first name input field
	WebElement firstNameInputField=driver.findElement(By.className("ng-touched"));
	//visible-----isDisplayed()
	//Editable----isEnabled()
	//Default value--getAttribute(String attributeNAme)
	System.out.println("first name input field is visible or not? "+firstNameInputField.isDisplayed());
	System.out.println("first name input field is editable?"+firstNameInputField.isEnabled());
	//cross-checking first name input field value
	
	}

}
