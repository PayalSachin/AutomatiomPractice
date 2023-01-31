package functions.mouseops;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseops2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/");	
		//identify all the elements of main menu
		List<WebElement> mainMenu = driver.findElements(By.cssSelector("#menu>ul>li>a"));
		System.out.println("Main Menu option count: " + mainMenu.size());
		// create an instance of Actions class by passing required browser instance to its constructor
				Actions act = new Actions(driver);
				/** to do hover over the Home option */
				act.moveToElement(mainMenu.get(2)).perform();
				//to do hover in all main menu options 
				for(int i=0;i<mainMenu.size();i++) {
					 WebElement option =mainMenu.get(i);
					 act.moveToElement(option).perform();
					 Thread.sleep(1000);
				}
				//mouse hover using reusable method
				//mouseHoverOverInTheElement(act, mainMenu.get(2));
				//mouseHover(act,mainMenu);
				
				
		
		}

		
	}



