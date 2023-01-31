package functions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluentwait {

	public static void main(String[] args) {
	//creat requird browser executable path using 
		System.setProperty("webdriver.chrome.driver",".//\\drivers\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		//enter the required url
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("login page title "+driver.getTitle());
		//type username as admin
		driver.findElement(By.id("username")).sendKeys("admin");
		//type password as manager
		driver.findElement(By.id("pwd")).sendKeys("manager");
		//click on login button
		driver.findElement(By.id("loginButton")).click();
		//creat an instance of Fluentwait  class wit timeout , polling time(retry) 
		//and exception to be ingnored
		FluentWait wait= new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
			//implement condition for wait , polinf work like 5,10,15 and 20
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		//click on logout link
		driver.findElement(By.id("logoutLink")).click();
		
	}

}
