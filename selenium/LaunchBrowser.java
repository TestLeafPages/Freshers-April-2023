package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
public static void main(String[] args) {
	//launch browser
	ChromeDriver driver=new ChromeDriver();
	//EdgeDriver driver=new EdgeDriver();
	
	//Load the Application url
	driver.get("https://www.facebook.com/");
	//Maximize the browser
	driver.manage().window().maximize();
	
	//enter the username as demosalesmanager
	WebElement findElement = driver.findElement(By.id("username"));
	
	
	
}
}
