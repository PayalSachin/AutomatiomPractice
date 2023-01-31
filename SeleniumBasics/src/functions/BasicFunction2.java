package functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicFunction2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		//crreat an instance of required browser class
		WebDriver driver= new ChromeDriver();
		//enter google appication url
		driver.get("https://www.google.com");
		//to close browser opened by webdriver
		//print current page title
		System.out.println(driver.getTitle());
		String appTitle=driver.getTitle();
		System.out.println(appTitle);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl().length());
		System.out.println(driver.getPageSource().length());
		driver.close();

		

		
		
		
		
		
	}
	}
		