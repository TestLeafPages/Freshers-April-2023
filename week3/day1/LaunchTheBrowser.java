package week3.day1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		//To launch Browser
//		ChromeDriver driver = new ChromeDriver();
//		EdgeDriver driver = new EdgeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		//Load url
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the window
		driver.manage().window().maximize();
//		Thread.sleep(2000);
		//close the window
		driver.close();
		
	}

}
