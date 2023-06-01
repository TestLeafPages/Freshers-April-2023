package week4.learnoops;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Audi extends Car {
 public void openSunRoof() {
	 System.out.println("Open Sun Roof");
 }
 public static void main(String[] args) {

	
	
	Audi audi=new Audi();
	audi.applyBreak();
	audi.soundHorn();
	audi.openSunRoof();
}
}
