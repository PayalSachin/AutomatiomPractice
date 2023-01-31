package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimetsk {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("https://www.actitime.com/free-online-trial");
    driver.findElement(By.id("FirstName")).sendKeys("sachin");
    driver.findElement(By.id("LastName")).sendKeys("kakade");
    driver.findElement(By.id("Email")).sendKeys("sachinkakade2861995@gmail.com");
    driver.findElement(By.id("Company")).sendKeys("abc");
    driver.findElement(By.id("conform-button")).click();
   
    
	}

}
