package week7.day2;

import org.openqa.selenium.NoSuchElementException;

public class LearnFinaly {
public static void main(String[] args) {
	
	int[] number= {1,2,3,4,5,6};
	
	
			try {
				System.out.println(number[6]);
			} finally {
				//finally is a block of code, If we are getting exception
				//the finally block will be execute
				// TODO Auto-generated catch block
				System.out.println("Program Running successfully");
			}
		

}
}
