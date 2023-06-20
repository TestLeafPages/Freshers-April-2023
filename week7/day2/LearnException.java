package week7.day2;

import org.openqa.selenium.NoSuchElementException;

public class LearnException {
public static void main(String[] args) {
	
	int[] number= {1,2,3,4,5,6};
	
	int a=10;

	
		try {
			System.out.println(number[6]);
		try {
			int b=a/0;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Handle ArithmeticException");
		}
			
		} catch (ArithmeticException e) {
			//System.out.println(b);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch (NoSuchElementException e) {
			//System.out.println(b);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			//System.out.println(b);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	System.out.println("Program Running successfully");
}
}
