package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml");
		driver.manage().window().maximize();
		boolean textBoxDisable = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		System.out.println(textBoxDisable);
		String retrivedText = driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
		driver.findElement(By.id("j_idt88:j_idt97")).sendKeys(Keys.TAB);
	}

}
