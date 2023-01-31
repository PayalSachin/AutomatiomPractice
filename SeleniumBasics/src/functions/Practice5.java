package functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice5 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://login.google.com/");
	driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("JavaTpoint.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	}
}
