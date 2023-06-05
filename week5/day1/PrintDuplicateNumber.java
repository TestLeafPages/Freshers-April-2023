package week5.day1;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumber {
public static void main(String[] args) {
	int[] number={6,7,8,1,2,3,4,1,2,3};
	
	Set<Integer> duplicateNumber=new TreeSet<Integer>();
	
	
	for (int i = 0; i < number.length; i++) {
		if(!duplicateNumber.add(number[i])) {
			System.out.println(number[i]);
		}
	}
	
	System.out.println(duplicateNumber);
}
}
