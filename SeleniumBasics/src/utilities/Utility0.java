package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utility0 {
	static WebDriver driver=null;
	
	public static void main(String[] args) {
		driver=setUp("chrome", "https://www.google.com");
		System.out.println(driver.getTitle());
		cleanUp();
	    
	}
	static WebDriver setUp(String browserName, String Url) {
		String exePath;
		if (browserName.equalsIgnoreCase("chrome")) {
			exePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
			// setting the path for driver executable
			System.setProperty("webdriver.chrome.driver", exePath);
			// creating an instance of Chrome browser and up-casting it to WebDriver interface
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			exePath = System.getProperty("user.dir") + "\\drivers\\geckodriver.exe";
			// setting the path for driver executable
			System.setProperty("webdriver.gecko.driver", exePath);
			// creating an instance of Chrome browser and up-casting it to WebDriver
			// interface
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to enter required application URL use get() of WebDriver interface
		driver.get(Url);
		return driver;
	}
	static void cleanUp() {
		driver.close();
	}

}