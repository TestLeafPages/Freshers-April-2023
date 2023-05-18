package week2.day4;

public class PrintOddCharacterTOUppercase {
public static void main(String[] args) {

           String test = "changeme"; 
//                         cHaNgEmE
//	 * a) Convert the String to character array
           char[] charArray = test.toCharArray();
//	 
//	 * b) Traverse through each character (using loop)
           for (int i = 0; i < charArray.length; i++) {
//   * c)find the odd index within the loop (use mod operator)
			if(i%2!=0) {
//	 * d)within the loop, change the character to uppercase, if the index is odd else don't change

				char upperCase = Character.toUpperCase(charArray[i]);
		System.out.print(upperCase);
			}else {
				System.out.print(charArray[i]);
			}
        	   
		}
 

}
}
