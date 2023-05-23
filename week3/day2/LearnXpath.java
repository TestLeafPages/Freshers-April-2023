package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://www.instagram.com/");
		 * driver.manage().window().maximize();
		 *  WebElement emailId =
		 * driver.findElement(By.xpath("//input[contains(@aria-label,'Ph')]"));
		 * emailId.sendKeys("gokul");
		 */
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		//attribute based xpath
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("DemoSalesManager");
		//index based xpath
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		// attribute based xpath
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		// contains text based xpath
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		//text based xpath
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		// text based xpath
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		// contains attribute based xpath
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Testleaf");
		//attribute based xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Gokul");
		//attribute based xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sekar");
		// attribute based xpath
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//close the window
		driver.close();
	}

}
