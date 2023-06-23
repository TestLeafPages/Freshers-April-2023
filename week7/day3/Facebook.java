package week7.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get( "https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	
	
	
	driver.findElement(By.xpath("//a[contains(@data-testid,'open')]")).click();
	
	//By name = By.name("firstname");
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(0));
	wait.until(ExpectedConditions.presenceOfElementLocated( By.name("firstname")));
	
	WebElement firstName = driver.findElement(By.name("firstname"));
	firstName.sendKeys("Vaishali");
}
}
