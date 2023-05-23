package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnClosevsQuit {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		WebElement firstOpenButton = driver.findElement(By.xpath("//span[text()='Open']"));
		firstOpenButton.click();
//		driver.close();
		Thread.sleep(2000);
		driver.quit();
	}

}
