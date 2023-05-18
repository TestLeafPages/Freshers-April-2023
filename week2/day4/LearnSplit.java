package week2.day4;

public class LearnSplit {
public static void main(String[] args) {
	
	String text="i like chicken briyani";
	String[] split = text.split(" ");
	
	//int length = split.length;
	//System.out.println(length);
	//Initialize the temp variable as count
	int count=0;
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
		//count=count+1;
		count++;
	}
	System.out.println(count);
}
}
