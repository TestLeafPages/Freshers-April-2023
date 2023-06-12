package week6.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.netty.handler.codec.http.multipart.FileUpload;

public class Facebook {
public static void main(String[] args) throws InterruptedException, IOException {
	ChromeDriver driver=new ChromeDriver();
	driver.get( "https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement createButton = driver.findElement(By.xpath("//a[contains(@data-testid,'open')]"));
	createButton.click();
	Thread.sleep(1000);
	WebElement firstName = driver.findElement(By.name("firstname"));
	firstName.sendKeys("Vaishali");
	
	File source = driver.getScreenshotAs(OutputType.FILE);
	File destination =new File("./snap/001.png");
	FileUtils.copyFile(source, destination);
	
	File from = firstName.getScreenshotAs(OutputType.FILE);
	File to =new File("./snap/002.png");
//	FileUtils.copyFile(from, to);
	FileHandler.copy(from, to);
	
	
	
	
	
}
}
