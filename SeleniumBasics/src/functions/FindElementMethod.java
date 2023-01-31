package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement usernameInputField=driver.findElement(By.id("Username"));
		//usernameInputField.clear();
		usernameInputField.sendKeys("Admin");
		WebElement passwordInputField=driver.findElement(By.id(""));
		passwordInputField.clear();
		passwordInputField.sendKeys("Test@123");
		WebElement signInBtn=driver.findElement(By.className("buttonBlue"));
		signInBtn.click();
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}

}
