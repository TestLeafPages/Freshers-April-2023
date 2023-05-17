package week2.day3;

import java.util.Arrays;

public class PrintAscendingOrder {
public static void main(String[] args) {
	int[] num= {300,500,900,200,700,100};
	
	Arrays.sort(num);
	int a=10;
	System.out.println(a);
	System.out.println(num);
	
	for (int i = 0; i < num.length; i++) {
		System.out.println(num[i]);
	}
	
	
	for(int i=num.length-1;i>=0;i--) {
		System.out.println(num[i]);
	}
}
}
