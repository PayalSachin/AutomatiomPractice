package functions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperatios {

	public static void main(String[] args) throws InterruptedException {
		//set required driver executable path using System.setProperty(key,value);
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//enter the required url
		driver.get("https://demo.automationtesting.in/Regester.html");
		//maximize browser window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//set required window size
		driver.manage().window().setSize(new Dimension(450, 600));
		//maximize brwser window
		driver.manage().window().maximize();
		driver.findElement(By.linkText("WebTable")).click();
		Thread.sleep(1500);
		//to come back to the previous page
		driver.navigate().back();
		Thread.sleep(1500);
		//to move to the next page
		driver.navigate().forward();
		Thread.sleep(1500);
		//to refresh current page
		driver.navigate().refresh();
		Thread.sleep(1500);
		//to move to different application
		driver.navigate().to("https://www.google.com");
		
	}

}
