package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		/*http://leaftaps.com/opentaps/control/main
		
		* 1	Launch the browser
		* 2	Enter the username
		* 3	Enter the password
		* 4	Click Login
		* 5	Click crm/sfa link
		* 6	Click Leads link
		* 7	Click Find leads
		* 8	Enter first name
		* 9	Click Find leads button
		* 10 Click on first resulting lead
		* 11 Verify title of the page
		* 12 Click Edit
		* 13 Change the company name
		* 14 Click Update
		* 15 Confirm the changed name appears
		* 16 Close the browser (Do not log out)
*/
		
		
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the window
		driver.manage().window().maximize();
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click on leads tab
		driver.findElement(By.linkText("Leads")).click();
		// Click on Find Lead
		driver.findElement(By.linkText("Find Leads")).click();
		// Enter first name in find lead field
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Gokul");
		// click on find leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		//click on first resulting lead
//		WebElement firstLeadId = driver.findElement(By.id("ext-gen867"));
		//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a
		WebElement firstLeadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String leadId = firstLeadId.getText();
		firstLeadId.click();
		// click on the delete button
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		// click on find Leads
		driver.findElement(By.linkText("Find Leads")).click();
		// Enter the leadId
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
		// click on find leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		// get no of recods display
		String recordDisplay = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		if(recordDisplay.equalsIgnoreCase("No records to display")) {
			System.out.println(leadId + " is deleted");
		}else {
			System.out.println(leadId + " is not delted");
		}
	}

}
