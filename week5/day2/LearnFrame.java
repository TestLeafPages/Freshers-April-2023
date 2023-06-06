package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {
public static void main(String[] args) {
	//Download the driver and set the path
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		//Load the application url
		driver.get("https://leafground.com/frame.xhtml");
		//Maximize the browser
		driver.manage().window().maximize();
		//Control move to frame
		driver.switchTo().frame(0);
		//Click on Click me button
		WebElement ele = driver.findElement(By.id("Click"));
		ele.click();
		String text = ele.getText();
		System.out.println(text);
		//Control move to out of the frame or main webPage
		driver.switchTo().defaultContent();
		
}
}
