package functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demosite.executeautomation.com/Login.html");
	driver.findElement(By.name("UserName")).sendKeys("Admin");
	driver.findElement(By.name("Password")).sendKeys("admin123");
 	driver.findElement(By.name("Login")).submit();
	
	}

}
