package dropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) {
    String driverpath= System.getProperty("user.dir")+"/\\drivers\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", driverpath);
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("http://demo.automationtesting.in/Register.html");
    //identify dropdown list
    WebElement droppdrg= driver.findElement(By.id("skills"));
    //create an instance of select class and pass above element into its constructor
    Select s=new Select(droppdrg);
    //check whether dropdown is multiselect or not
    s.isMultiple();
    //get default or already select option
    System.out.println("already selected option is "+s.getFirstSelectedOption().getText());
    //get option count
    List<WebElement> options = s.getOptions();
	System.out.println("Option count is:" + options.size());
	// Get dropdown option names
	for (int i = 0; i < options.size(); i++) {
		System.out.println("Option " + i + ": " + options.get(i).getText());
	}
	// TODO: validation dropdown skills are getting displayed in ascending order

			// select options from dropdown
			s.selectByIndex(4);
			System.out.println("Already selected option name: " + s.getFirstSelectedOption().getText());
			// or
			s.selectByValue("Backup Management");
			System.out.println("Already selected option name: " + s.getFirstSelectedOption().getText());
			// or
			s.selectByVisibleText("Analytics");
			System.out.println("Already selected option name: " + s.getFirstSelectedOption().getText());

			//Checking the order of skills
			String act_skillName="";
			// Get dropdown option names
			for (int i = 1; i < options.size(); i++) {
				if((options.size()-1)!=i) {
					act_skillName=act_skillName+options.get(i).getText()+", ";
				}else {
					act_skillName=act_skillName+options.get(i).getText();
				}
			}
			//Expected skills
			String exp_skillName="Adobe InDesign, Adobe Photoshop, Analytics, Android, APIs, Art Design, AutoCAD, Backup Management, C, C++, Certifications, Client Server, Client Support, Configuration, Content Managment, Content Management Systems (CMS), Corel Draw, Corel Word Perfect, CSS, Data Analytics, Desktop Publishing, Design, Diagnostics, Documentation, End User Support, Email, Engineering, Excel, FileMaker Pro, Fortran, HTML, Implementation, Installation, Internet, iOS, iPhone, Linux, Java, Javascript, Mac, Matlab, Maya, Microsoft Excel, Microsoft Office, Microsoft Outlook, Microsoft Publisher, Microsoft Word, Microsoft Visual, Mobile, MySQL, Networks, Open Source Software, Oracle, Perl, PHP, Presentations, Processing, Programming, PT Modeler, Python, QuickBooks, Ruby, Shade, Software, Spreadsheet, SQL, Support, Systems Administration, Tech Support, Troubleshooting, Unix, UI / UX, Web Page Design, Windows, Word Processing, XML, XHTML";
			System.out.println("skillName: "+act_skillName);
			System.out.println("exp_skillName: "+exp_skillName);
			System.out.println("Skills are in sorted order or not: "+act_skillName.equals(exp_skillName));

			// TODO: perform validation on following
			// 1. Year(ascending order validation)
			// 2. Month(month Sequence validation)
			// 3. Days(ascending order validation)
			
			Select dayDrop=new Select(driver.findElement(By.id("daybox")));
			List<Integer> days=new ArrayList<Integer>();
			for(int i=1;i<dayDrop.getOptions().size();i++) {
				String day=dayDrop.getOptions().get(i).getText();
				days.add(Integer.parseInt(day));
			}
			List<Integer> dupDays=new ArrayList<Integer>(days);
			//dupDays.addAll(days);
			Collections.sort(dupDays);
			System.out.println(days.equals(dupDays));
		}
	}
