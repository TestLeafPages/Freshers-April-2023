package week2.day5;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
//	*Declare a String 
     String text1 = "stops";
// *Declare another String
     String text2 = "potss"; 
// * a) Check length of the strings are same then (Use A Condition)
     
     if(text1.length()==text2.length()) {
    	 System.out.println("Length are equal");
     }else {
    	 System.out.println("Length are not  equal");
     }
    	 
// * b) Convert both Strings in to characters
     char[] charArray1 = text1.toCharArray();
     char[] charArray2 = text2.toCharArray();
// * c) Sort Both the arrays
     Arrays.sort(charArray1);
     Arrays.sort(charArray2);
     
     System.out.println(Arrays.toString(charArray1));
     System.out.println(Arrays.toString(charArray1));
// * d) Check both the arrays has same value
     boolean equals = Arrays.equals(charArray1, charArray2);
     System.out.println(equals);
     if(Arrays.equals(charArray1, charArray2)){
    	 System.out.println("Given String is an Anagram");
     }else {
    	 System.out.println("Given String is not an Anagram");
     }
}
}
