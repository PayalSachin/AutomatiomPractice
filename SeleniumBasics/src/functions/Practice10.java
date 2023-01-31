package functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice10 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://demo.automationtesting.in/Register.html");
	//identify first name input field
	WebElement firstNameInputField= driver.findElement(By.className("form-control"));
	System.out.println("first name input field is visible or not? "+firstNameInputField.isDisplayed());
	System.out.println("first name input field is editable?"+firstNameInputField.isEnabled());
	String FirstNameInputFieldValue=firstNameInputField.getAttribute("Placeholder");
	System.out.println("default value validation status:"+ FirstNameInputFieldValue.equals("First Name"));
	//identyfy radio button
	WebElement radioButton=driver.findElement(By.name("radiooptions"));
	/*
	 * visible
	 * Functional 
	 * by default should not be selected
	 * select and verify, now its selected or not
	 */
	System.out.println("radio button selected or not"+radioButton.isDisplayed());
	System.out.println("is radio button functional or not"+radioButton.isEnabled());
	System.out.println("is radio button selected by default or  not"+radioButton.isSelected());
	radioButton.click();
	System.out.println("after selection radio buttons status is "+radioButton.isSelected());
	//identify submit button
	WebElement submitbtn= driver.findElement(By.id("submitbtn"));
	/*
	 * visible --- isDisplayed()
	 * Functional--- isEnabled()
	 * Default value- button name is coming from inner HTML text, so we will be using getText()
	 * */
	System.out.println("submit button visible or not"+submitbtn.isDisplayed());
	System.out.println("submit btn functional or not"+submitbtn.isEnabled());
	String actualButtonName=submitbtn.getText().trim();//text has additional spaces, to remove that use trim()
	System.out.println("Submit button name validation status? "+actualButtonName.equals("Submit"));
	driver.close();
}
}