package functions.mouseops;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Setup {

	public static void main(String[] args) {
    WebDriver driver=setUp("chrome","https://www.facebook.com/");
    //instance of Actions class
    Actions act=new Actions(driver);
    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
    WebElement usernameInputField=  driver.findElement(By.name("firstname"));
    usernameInputField.sendKeys("sachin");
    usernameInputField.sendKeys(Keys.chord(Keys.CONTROL,"a"));
    
    
  

    
    
	}

	private static WebDriver setUp(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

}
