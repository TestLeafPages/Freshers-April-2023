package week2.day4;

public class LearnReplaceAll {
public static void main(String[] args) {
	
	String email="testleaf826@gmail.com";
	
	//String replaceAll = email.replaceAll("[^0-9]", "");
	//String replaceAll = email.replaceAll("\\D", "");
	//System.out.println(replaceAll);
	
//	char[] charArray = email.toCharArray();
//	for (int i = 0; i < charArray.length; i++) {
//		if(Character.isDigit(charArray[i])) {
//			System.out.println(charArray[i]);
//		}
//	}

	char[] charArray = email.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		if(charArray[i]>=48 &&  charArray[i]<=57) {
			System.out.println(charArray[i]);
		}
	}
	
}
}
