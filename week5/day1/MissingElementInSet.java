package week5.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MissingElementInSet {
public static void main(String[] args) {
	int[] number={1,2,3,4,6,7,8,1,2,3};
	//Declare a empty set
	Set<Integer> uniqueNumber=new LinkedHashSet<Integer>();
	//iterate the values from intArray
	for (int i = 0; i < number.length; i++) {
		  //add the values in set
		uniqueNumber.add(number[i]);
	}
	//Print unique number
	System.out.println(uniqueNumber);
	
	//Declare empty list 
	List<Integer> missingElement=new ArrayList<Integer>(uniqueNumber);
	System.out.println(missingElement);
	
	for (int i = 0; i < missingElement.size()-1; i++) {
		if(missingElement.get(i+1)!= missingElement.get(i)+1){
			   // 1 !=1
			System.out.println(missingElement.get(i)+1);
			break;
		}
	}
	
	
	
	
	
} 
}
