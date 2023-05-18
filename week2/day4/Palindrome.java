package week2.day4;

public class Palindrome {
public static void main(String[] args) {
	//1.Declare a String as input
    String input="madam";
//2.Declare an empty String as rev
    String rev="";
//3.Convert the String into character array
  char[] charArray=  input.toCharArray();
     //    m,a,d,a,m

//4.Iterate the Character using reverse for loop
for(int i=charArray.length-1; i>=0;i--){
    rev= rev+charArray[i];
          
}
System.out.println(rev);

//verify if the String is Palindrome or not
if(input.equals(rev)){
      System.out.println("The given string is palindrome");
}else{
   System.out.println("The given string is not palindrome");

}
}
}
