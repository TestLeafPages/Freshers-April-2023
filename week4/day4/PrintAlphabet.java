package week4.day4;

import java.util.ArrayList;
import java.util.List;

public class PrintAlphabet {
public static void main(String[] args) {
	
	List<Character> letter=new ArrayList<Character>();
	letter.add('A');
	letter.add('B');
	letter.add('C');
	letter.add('D');
	letter.add('E');
	
	System.out.println(letter);
	
	for (int i = 0; i <letter.size(); i++) {
		System.out.println(letter.get(i));
	}
	
	letter.add(0, '5');
	
	System.out.println(letter);
	
	letter.remove(4);
	
	System.out.println(letter);
	
	boolean contains = letter.contains('A');
	System.out.println(contains);
	
	
	letter.clear();
	System.out.println(letter);
	
	System.out.println(letter.isEmpty());
}
}
