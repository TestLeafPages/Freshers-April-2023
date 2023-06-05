package week5.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	Set<String> name=new LinkedHashSet<String>();
	
	name.add("Praveen");
	name.add("Hari");
	name.add("Meenakshi");
	name.add("Vaishu");
	name.add("Sathurya");
	name.add("Sam");
	boolean add = name.add("Indhu");
	System.out.println(add);
	name.add("Balu");
	name.add("arun");
	boolean add2 = name.add("Indhu");
	System.out.println(add2);
	
	
	for (String eachName : name) {
		System.out.println(eachName);
	}
	//HashSet
//[Hari, Indhu, Meenakshi, Sathurya, Vaishu, Praveen, Sam]
	//TreeSet
//[Hari, Indhu, Meenakshi, Praveen, Sam, Sathurya, Vaishu]	
	//Linked Hash Set
//Praveen, Hari, Meenakshi, Vaishu, Sathurya, Sam, Indhu, Balu, arun]

	System.out.println(name);
}
}
