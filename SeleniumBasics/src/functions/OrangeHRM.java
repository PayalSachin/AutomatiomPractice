package functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//below driver will get 0-30 sec to identify user input field
	driver.findElement(By.name("username")).sendKeys("admin");
	//below driveer will get 0-30  sec to identify password input field
	driver.findElement(By.name("password")).sendKeys("Admin123");
	//driver will get 0-30 sec to identify login button
	driver.findElement(By.tagName("button")).click();
	
	}

}
