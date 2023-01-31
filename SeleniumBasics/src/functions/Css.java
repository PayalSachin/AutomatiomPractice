package functions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("\"https://demo.automationtesting.in/Register.html\"");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//set requied window size
	driver.manage().window().setSize(new Dimension(400,600));
	driver.manage().window().maximize();
	driver.findElement(By.linkText("WebTable")).click();
	Thread.sleep(2000);
	//to come back to previous page
	driver.navigate().back();
	Thread.sleep(1500);
	//to move to next page
	driver.navigate().forward();
	Thread.sleep(1500);
	//to refresh current page
	driver.navigate().refresh();
	//to move to different url
	driver.navigate().to("http://www.google.com");

	
	
	
	}

}
