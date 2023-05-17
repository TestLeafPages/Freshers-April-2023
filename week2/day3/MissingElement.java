package week2.day3;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		//5

		// Sort the array	

        Arrays.sort(arr);
        
        System.out.println(Arrays.toString(arr));
        
        for (int i = 0; i < arr.length; i++) {
        	int j=i+1;
			if(arr[i]!=j) {
				System.out.println(j);
				break;
			}
				
		}
        
        
	}
}
