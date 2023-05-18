package week2.day4;

public class PrintCharacter {
	String name="test";
public static void main(String[] args) {
	
	String name ="testleaf";
	//to get the count of the given string
	int length = name.length();
	System.out.println(length);
    //output: t,e,s,t,l,e,a,f
//String converted into character using tocharArray method
  char[] charArray=  name.toCharArray();

//Iterating the values using for loop
     for(int i=0;i<charArray.length;i++){
    System.out.print(charArray[i]+" ");
}

}
}
