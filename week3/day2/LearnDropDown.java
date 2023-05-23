package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Launch browser
				ChromeDriver driver = new ChromeDriver();
				// Maximize the window
				driver.manage().window().maximize();
				// Load the url
				driver.get("http://leaftaps.com/opentaps/");
				// Locate username field
				WebElement username = driver.findElement(By.id("username"));
				//Enter username as DemoSalesManager
				username.sendKeys("DemoSalesManager");
				//Locate password field
				WebElement password = driver.findElement(By.id("password"));
				//Enter password as crmsfa
				password.sendKeys("crmsfa");
				//Click on the Login button
				WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
				loginButton.click();
				//Get title of the welcome page
				String welcomePageTitle = driver.getTitle();
				System.out.println("welcomePageTitle : " + welcomePageTitle);
				// Click on the crmsfa link
				WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
				crmsfa.click();
				// Get title of the MyHome page
				String HomePageTitle = driver.getTitle();
				System.out.println("HomePageTitle : " + HomePageTitle);
				// Click on the leads tab
				WebElement leadsTab = driver.findElement(By.linkText("Leads"));
				leadsTab.click();
				//Click on the create lead 
				WebElement createLead = driver.findElement(By.linkText("Create Lead"));
				createLead.click();
				//Enter companyName as TestLeaf
				WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
				companyName.sendKeys("Testleaf");
				//Enter the firstName as Gokul
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
				//Enter the last name as Sekar
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
				//Source dropdown
				WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select sourcedd = new Select(sourceDD);
				// Select partner from the source dropdown
				sourcedd.selectByIndex(7);
				Thread.sleep(5000);
				sourcedd.selectByValue("LEAD_EMPLOYEE");
				Thread.sleep(5000);
				sourcedd.selectByVisibleText("Conference");
				driver.findElement(By.className("smallSubmit")).click();
				WebElement companynameWithId = driver.findElement(By.id("viewLead_companyName_sp"));
				String leadId = companynameWithId.getText();
				System.out.println("Lead Id : " + leadId);
				if(leadId.contains("Testleaf")) {
					System.out.println("The companyname is verified");
				}else {
					System.out.println("The companyname is not verified");
				}
				driver.close();
	}

}
