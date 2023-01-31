package functions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice4 {

	public static void main(String[] args) {
		//set required driver exe path
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe");
		//creat an instance of required browser class
		WebDriver driver= new ChromeDriver();
		//enter the required browser class url
		driver.get("https://www.actitime.com/free-online-trial");
		String loginPageTitle=driver.getTitle();
		System.out.println("loginpage title is "+loginPageTitle);
		System.out.println("loginpage title length is "+loginPageTitle.length());
		String expectedTitle= "actiTime - Login";
		System.out.println("Login page validation "+loginPageTitle.equals(expectedTitle));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		//required conditional wait as Home page takes sometime to update its title 
		WebDriverWait Wait= new WebDriverWait(driver,20);
		Wait.until(ExpectedConditions.titleIs("actiTime - Enter Time-Track"));
		String actualHomePageTitle=driver.getTitle();
		String expectedHomePageTitle="actiTime - Enter Time-Track";
		System.out.println("Actual HomePage Title "+actualHomePageTitle);
		System.out.println("Home page validation status is "+actualHomePageTitle.equals(expectedHomePageTitle));
		//after successful login verify home page title
		
		
		
		
	}

}
