package functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice11 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://demo.automationtesting.in/Register.html");
	//maximize browser window
	driver.manage().window().maximize();
	driver.findElement(By.linkText("WebTable")).click();
	Thread.sleep(2000);
	//to come back to previous page
	driver.navigate().back();
	Thread.sleep(1500);
	//to move to the next page
	driver.navigate().forward();
	Thread.sleep(1500);
	//to move to different application
	driver.navigate().to("\"http://www.google.com");
	}

}
