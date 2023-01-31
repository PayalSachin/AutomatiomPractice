package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe/");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        System.out.println("Successfully opened the website");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("Enter the USERNAME");
        driver.findElement(By.id("pass")).sendKeys("Enter the PASSWORD");
        driver.findElement(By.id("u_0_r")).click();
        System.out.println("Successfully logged in");
        Thread.sleep(3000);
        driver.findElement(By.id("userNavigationLabel")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Log out")).click();
        System.out.println("Successfully logged out");
      
        driver.close();

    }
	}


