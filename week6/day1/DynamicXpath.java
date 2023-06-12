package week6.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicXpath {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions  options =new ChromeOptions();
	options.addArguments("start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
	//load the applilcation url
	driver.get("https://erail.in/");
	//Enter the values in from field
	WebElement from = driver.findElement(By.id("txtStationFrom"));
	from.clear();
	from.sendKeys("MAS",Keys.ENTER);
	
	//Enter the values in To field
	WebElement to = driver.findElement(By.id("txtStationTo"));
	to.clear();
	to.sendKeys("MDU",Keys.ENTER);
	//click on sort on date check box
	driver.findElement(By.id("chkSelectDateOnly")).click();
	Thread.sleep(5000);
	List<WebElement> trainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr"));
	
	System.out.println(trainNames.size());
	
	                                                                                                             for (int i = 2; i <=trainNames.size(); i++) {
	String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]/td[2]")).getText();
	System.out.println(text);
	}
	//	
//		
//		
//	}
	
	
	
	
	
}
}
