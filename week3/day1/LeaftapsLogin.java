package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsLogin {

	public static void main(String[] args) {
		
		//Launch browser
		ChromeDriver driver = new ChromeDriver();
		// Maximize the window
		driver.manage().window().maximize();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/");
		// Locate username field
		WebElement username = driver.findElement(By.id("username"));
		//Enter password as DemoSalesManager
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
		//To close the window
		driver.close();
	}

}
