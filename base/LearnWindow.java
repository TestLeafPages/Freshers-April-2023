package base;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindow {
public static void main(String[] args) throws IOException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver driver=new ChromeDriver(options);
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	//Click on Flights
	driver.findElement(By.linkText("FLIGHTS")).click();
	//Current active Window
	String parentWindow = driver.getWindowHandle();
	
	Set<String> childWindow = driver.getWindowHandles();
	System.out.println(childWindow.size());
	
	
	List<String> window=new ArrayList<String>(childWindow);
	
	driver.switchTo().window(window.get(1));
	
	System.out.println(driver.getTitle());
	
	File from = driver.getScreenshotAs(OutputType.FILE);
	File to=new File("./data/001.png");
	FileUtils.copyFile(from, to);
	
//	driver.switchTo().window(window.get(0));
//	driver.switchTo().window(parentWindow);
	
	
	
	
	
	
	
	
	
}
}
