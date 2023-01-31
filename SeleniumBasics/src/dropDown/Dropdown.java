package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) {
    String driverpath=System.getProperty("user.dir")+ "\\drivers\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", driverpath);
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
    WebElement dropdown= driver.findElement(By.id("bsd1-button"));
  //wait.until(ExpectedConditions.elementToBeClickable(dropdown));
  		//identify dropdown list and click on it
    dropdown.click();
    //identify all the element and store them on <webdelement> list
    List<WebElement> options=driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a\""));
    //use size to get option count
    System.out.println("count is "+options.size());
    //use for loop t print one by one options
    for (int i=0;i<options.size();i++) {
    	System.out.println(i);
    	System.out.println(options.get(i).getText());
    }
    options.get(2).click();
	}

}
