package week2.day5;

public class PrintUniqueNumber {
public static void main(String[] args) {
	
	int[] num= {1,2,3,4,5,6,1,2,3};
	int count;
	for (int i = 0; i < num.length; i++) {
		count=1;
		for (int j = i+1; j < num.length; j++) {
			if(num[i]==num[j]) {
				count++;
				num[j]=99;
			}
		}
		if(count>=1 && num[i]!=99) {
			System.out.println(num[i]);
		}
	}
}
}
