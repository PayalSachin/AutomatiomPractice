package functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		//set required driver .exe path
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create an instance of required browser class
		WebDriver driver=new ChromeDriver();
		//enter the required application url
		driver.get("https://www.google.com");
		//print current page title
		//System.out.println("Application title: "+driver.getTitle());
				//or
		String appTitle=driver.getTitle();
		System.out.println("Application title: "+appTitle);
		System.out.println("Application title lenght: "+appTitle.length());
		
		//print current page URL
		System.out.println("Current page URL is: "+driver.getCurrentUrl());
		System.out.println("Current page URL lenght: "+driver.getCurrentUrl().length());
		
		//print page source length
		System.out.println("Current page source code lenght: "+driver.getPageSource().length());
		//close current browser
		driver.close();
	}
}
