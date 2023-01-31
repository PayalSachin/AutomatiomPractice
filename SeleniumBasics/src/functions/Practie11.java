package functions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practie11 {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis= new FileInputStream(".\\src\\test.properties");
		Properties prop= new Properties();
		prop.load(fis);
		String url=prop.getProperty("url");
		String FirstName=prop.getProperty("FirstName");
		String LastName=prop.getProperty("LastName");
		String password=prop.getProperty("Password");
		String EmailAddress=prop.getProperty("EmailAddress");
		String Phone=prop.getProperty("Phone");
		String Languages= prop.getProperty("Languages");
		String expectedTitle=prop.getProperty("expectedHomePageTitle");
		
		System.out.println("url is "+url);
		System.out.println("FirstName "+FirstName);
		System.out.println("LastName "+LastName);
		System.out.println("expectedTitle "+expectedTitle);
		System.out.println("EmailAddress "+EmailAddress);
		System.out.println("Languages "+Languages);
		System.out.println("Password "+password);
		
		System.setProperty("webdriver.chrome.driver",".//drivers\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(33, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(url);
		driver.findElement(By.id("FirstName")).sendKeys(LastName);
		driver.findElement(By.id("LastName")).sendKeys(LastName);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.className("EmailAddress")).sendKeys(EmailAddress);
		driver.findElement(By.className(Languages)).sendKeys(Languages);
		driver.findElement(By.id("SubmitButton")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		String actualTitle= driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("login successfull");
		}else {
			System.out.println("login failed");
		}


	}

}
