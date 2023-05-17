package week2.day3;

import java.util.Arrays;

public class MissingElement2 {
	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,5,8,6,10};
		//5

		int sum1=0;
		for (int i = 1; i <=10; i++) {
			sum1=sum1+i;
		}
        System.out.println(sum1);
        
        int sum2=0;
        for (int i = 0; i < arr.length; i++) {
			sum2=sum2+arr[i];
		}
        System.out.println(sum2);
        
        int sum3=sum1-sum2;
        System.out.println("Missing Element "+sum3);
	}
}
