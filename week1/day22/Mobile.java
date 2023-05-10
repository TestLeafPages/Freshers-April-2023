package week1.day22;

import java.util.ArrayList;

public class Mobile {
	
	String brandName="Samsung";
	char firstLetter='S';
	long imeiNumber=67432746324673482L;
	int noOfCamera=3;
	float screenSize=6.5F;
	boolean isDamaged=true;
	double mobilePrice=65.7652;
	
	void switcOnMobile() {
		System.out.println("Switch On mobile");
	}
	
public static void main(String[] args) {
	Mobile mob=new Mobile();
	System.out.println(mob.brandName);
	mob.switcOnMobile();
}
}
