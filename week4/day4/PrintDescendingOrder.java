package week4.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDescendingOrder {
public static void main(String[] args) {
	int[] num= {1,5,8,9,2,3,4,5};
	//print descending order
	//output 9,8,5,5,4,3,2,1
	
	//Declare an Empty list
	List<Integer> obj =new ArrayList<Integer>();
	//Iterate the values from num Array
	for (int i = 0; i < num.length; i++) {
		// To add the values in List
		obj.add(num[i]);
	}
	Collections.sort(obj);
	//Print the List
	System.out.println(obj); 
	
}
}
