package week2.day4;

public class LearnEqualsMethod {
public static void main(String[] args) {
	
	String name1="Testleaf";
	String name2=new String("Testleaf");
	
	boolean equals = name1.equals(name2);
	System.out.println(equals);
//	if(name1.equals(name2)) {
//		System.out.println("both are equal");
//	}else {
//		System.out.println("both are not equal");
//	}
//	if(name1==name2) {
//		System.out.println("both are equal");
//	}else {
//		System.out.println("both are not equal");
//	}
	String str1=new String("Testleaf");
	String str2=new String("Testleaf");
	//if(str1==str2) {
//	if(str1.equals(str2)) {
//		System.out.println("both are equal");
//	}else {
//		System.out.println("both are not equal");
//	}
	
	String val1="Testleaf";
	String val2="Testleaf";
	//if(val1.equals(val2)) {
	if(val1==val2) {
		System.out.println("both are equal");
	}else {
		System.out.println("both are not equal");
	}
	
	
}
}
