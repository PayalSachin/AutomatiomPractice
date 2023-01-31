package functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//set requied window size
		driver.manage().window().setSize(new Dimension(400,600));
		driver.manage().window().maximize();
		
		WebElement element= driver.findElement(By.cssSelector("input[name='q']"));
		element.sendKeys("samsung");
		WebElement element1=driver.findElement(By.linkText("/account/login?ret=/"));
		element1.click();
		
	}

}
