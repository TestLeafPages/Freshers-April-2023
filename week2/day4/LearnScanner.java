package week2.day4;

import java.util.Scanner;

public class LearnScanner {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the input");
	String nextLine = scan.nextLine();
	
	char[] charArray = nextLine.toCharArray();
	
	for (int i = 0; i < charArray.length; i++) {
		System.out.println(charArray[i]);
	}
	
}
}
