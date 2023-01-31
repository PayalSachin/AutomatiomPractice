package functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	String loginpagetitle=driver.getTitle();
	String expectedTitle="actiTIME - Login";
	loginpagetitle.equals(expectedTitle);
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");		
	driver.findElement(By.id("loginButton")).click();
	//required conditional wait as Home page takes sometime to update its title
	WebDriverWait Wait= new WebDriverWait(driver,20);
Wait.until(ExpectedConditions.titleIs(expectedTitle));
String actualHomePageTitle=driver.getTitle();
String expectedHomePageTitle="actiTIME - Enter Time-Track";
System.out.println("Actaul Home page title: "+actualHomePageTitle);
System.out.println("Home page validation status is: "+actualHomePageTitle.equals(expectedHomePageTitle));
}

/**
* After successfull login verify home page title
*/
}


