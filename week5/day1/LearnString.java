package week5.day1;

public class LearnString {
public static void main(String[] args) {
	
	int[] number={1,2,3,4,6,7,8,1,2,3};
	//Unique Number 1,2,3,4,5,6,7,8
	
	//Initialize the count variable
	int count =0;
	
	//Iterate the values from 0 to array length
	
	for (int i = 0; i < number.length; i++) {
		count=1;
		for (int j = i+1; j < number.length; j++) {
			 if(number[i]==number[j]) {
				 count++;
				 number[j]=999;
			 }
		}
		if(count>=1 && number[i]!=999) {
			System.out.println(number[i]);
		}
	}
	
	
	
	
	
	
	
}
}
