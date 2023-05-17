package week2.day3;

import java.util.Arrays;

public class LearnArray {
public static void main(String[] args) {
	int[] marks={90,90,96,99,90};
	
	
	//to get the size of an array
	int len = marks.length;
	System.out.println(len);
	System.out.println(marks[3]);
	
	//sort values in ascending order
	Arrays.sort(marks);
	
	
	//iterating the marks using for loop
	for (int i = 0; i <marks.length; i++) {
		System.out.println(marks[i]);
	}
	
}
}
