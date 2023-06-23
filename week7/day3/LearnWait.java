package week7.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWait {
public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/waits.xhtml;jsessionid=node01jhdpbw8zw8hz14pnoeve66uq2318140.node0");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//span[text()='Click']")).click();
	
	WebElement ele = driver.findElement(By.xpath("//span[text()='I am here']"));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOf(ele));
	
	
	
	
	
}
}
