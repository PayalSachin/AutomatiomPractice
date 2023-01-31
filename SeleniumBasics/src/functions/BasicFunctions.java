package functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicFunctions {

	public static void main(String[] args) {
		//set required driver .exe path
				System.setProperty("webdriver.chrome.driver", ".//drivers\\chromedriver.exe");
				//create an instance of required browser class
				WebDriver driver=new ChromeDriver();
				//enter the required application url
				driver.get("https://demo.vtiger.com/vtigercrm/index.php");
				//identify username input field
				WebElement usernameInputField=driver.findElement(By.id("username"));
				//clear username inputfield
				usernameInputField.clear();
				//type username as admin
				usernameInputField.sendKeys("admin");
				//identify password input field
				WebElement passwordInputField=driver.findElement(By.id("password"));
				//clear password field
				passwordInputField.clear();
				//type password as Test@123
				passwordInputField.sendKeys("Test@123");
				//identify Sign in button
				WebElement signinBtn=driver.findElement(By.className("buttonBlue"));
				//click on signin button
				signinBtn.click();
				//get home page title
				System.out.println("Home page title is: "+driver.getTitle());
				//close the brower
				driver.close();
			}
		}

	


