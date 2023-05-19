package week2.day5;

public class ReverseEvenWords {
public static void main(String[] args) {
	//* Declare the input as Follow
		String test = "I am a software tester";
		
		                 //ma  erawtfos
          String[] split = test.split(" ");
          
          for (int i = 0; i < split.length; i++) {
			
        	  if(i%2!=0) {
        		//  System.out.println(split[i]);
        		  char[] arr1 = split[i].toCharArray();
        		  for(int j= arr1.length-1;j>=0;j--) {
        			  System.out.print(arr1[j]);
        		  }
        		  System.out.print(" ");
        	  }
        	  else {
    
        		  
        		  System.out.print(split[i]+" ");
        	  }
		}
}
}
