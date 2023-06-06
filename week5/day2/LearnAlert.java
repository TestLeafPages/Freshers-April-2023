package week5.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
public static void main(String[] args) throws InterruptedException {
	
	//Download the driver and set the path
	//Launch the chrome browser
	ChromeDriver driver=new ChromeDriver();
	//Load the application url
	driver.get("https://leafground.com/alert.xhtml;jsessionid=node01horv5c1l5n4dfioswovj273q290729.node0");
	//Maximize the browser
	driver.manage().window().maximize();
	
	//click on show button
	driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
	//controll move to an alert
	Alert alert = driver.switchTo().alert();
	Thread.sleep(3000);
	//accept the alert
	alert.accept();
	//2nd alert
	//Click on ConfirmButton
	driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
	//controll move to an alert
	Alert confirmAlert = driver.switchTo().alert();
	Thread.sleep(3000);
	//accept the alert
	confirmAlert.dismiss();
	

	driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
	//controll move to an alert
	Alert promptAlert = driver.switchTo().alert();
	Thread.sleep(3000);
	String text = promptAlert.getText();
	System.out.println(text);
	Thread.sleep(3000);
	promptAlert.sendKeys("TestLeaf");
	//accept the alert
	promptAlert.accept();
	
	driver.findElement(By.xpath("//span[text()='Delete']")).click();
	Alert sweetAler = driver.switchTo().alert();
	sweetAler.accept();
	
}
}
