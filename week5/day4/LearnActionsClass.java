package week5.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnActionsClass {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications","start-maximized");
	
	ChromeDriver driver=new ChromeDriver(options);
	//Load the application url
	driver.get("https://www.ajio.com/");
	//Maximize the browser
//	driver.manage().window().maximize();
	
	WebElement hoverMen = driver.findElement(By.xpath("//a[text()='MEN']"));
 
	Actions builder=new Actions(driver);
	
	builder.moveToElement(hoverMen).perform();
	
	
	driver.findElement(By.xpath("(//a[text()='Shirts'])[1]")).click();
	
	
	
	
	
}
}
