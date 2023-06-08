package week5.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {
public static void main(String[] args) {
	//Launch the chrome browser
			ChromeDriver driver=new ChromeDriver();
			//Load the application url
			driver.get("https://leafground.com/window.xhtml");
			//Maximize the browser
			driver.manage().window().maximize();
			//Store the parent Window
			String parentWindow = driver.getWindowHandle();
			System.out.println(parentWindow);
			String title1 = driver.getTitle();
			System.out.println(title1);
			
			//click on Open button
			driver.findElement(By.xpath("//span[text()='Open']")).click();
			
			//To get size of childWindow
			Set<String> childWindow = driver.getWindowHandles();
			System.out.println(childWindow.size());
			//Create empty List and pass the set object name in list Constructor
			List<String> OpenedWindow=new ArrayList<String>(childWindow);
			//Control move to child window
			driver.switchTo().window(OpenedWindow.get(1));
			
			String title2 = driver.getTitle();
			System.out.println(title2);
			
			//driver.close();
			driver.quit();
}
}
