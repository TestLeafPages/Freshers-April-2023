package week4.day4;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
	
	List<String> name=new ArrayList<String>();
	
	name.add("Praveen");
	name.add("Hari");
	name.add("Meenakshi");
	name.add("Vaishu");
	name.add("Sathurya");
	name.add("Sam");
	name.add("Indhu");
	
	System.out.println(name);
	
	int size = name.size();
	System.out.println(size);
	
	for (int i = 0; i < name.size(); i++) {
		System.out.println(name.get(i));
	}
	
	
	
}
}
