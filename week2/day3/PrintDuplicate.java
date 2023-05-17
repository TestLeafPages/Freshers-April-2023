package week2.day3;

public class PrintDuplicate {
public static void main(String[] args) {
	int[] numbers={11,21,31,21,8,9,11};
	//output: 11,21
	
	for (int i = 0; i < numbers.length; i++) {
		for (int j = i+1; j < numbers.length; j++) {
			
			if(numbers[i]==numbers[j]) {
				System.out.println(numbers[i]);
			}
		}
	}
}
}
