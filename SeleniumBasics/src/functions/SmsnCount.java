package functions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmsnCount {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("https:www.gsmarena.com/samsung=phone");
    //identify device name
    List<WebElement> devicename=(List<WebElement>) driver.findElement(By.className("article-info-name"));
    //get the couunt
    System.out.println("counnt"+devicename.size());
    for (int i=0;i<devicename.size();i++) {
    	System.out.println(devicename.get(i).getText());
    }
	}

}
