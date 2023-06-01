package week4.oops2;

import java.util.ArrayList;
import java.util.List;

public class Samsung implements AndroidDesign, SamsungDesign {

	@Override
	public void switchOnMobile() {
		// TODO Auto-generated method stub
		System.out.println("Switch on Mobile");
		
	}

	@Override
	public void sendSms() {
		
		System.out.println(" Send SMS");
	}

	@Override
	public void takeSnap() {
		// TODO Auto-generated method stub
		System.out.println("Take snap");
	}

	@Override
	public void switchOffMobile() {
	System.out.println("Switch off mobile");
		
	}
public static void main(String[] args) {
	Samsung samsung=new Samsung();
	samsung.switchOffMobile();
	samsung.switchOnMobile();
	samsung.sendSms();
	samsung.takeSnap();
	samsung.logoDesign();
	samsung.faceAuthentication();
	samsung.samsungNote();
	
	//AndroidDesign design=new AndroidDesign();
	AndroidDesign design=new Samsung();
	List<String> obj=new ArrayList<String>();
	design.switchOffMobile();
	design.switchOnMobile();
	design.sendSms();
	design.takeSnap();
//	design.logoDesign();
//	design.faceAuthentication();
//	design.samsungNote();
//	design.shareDocument();
	SamsungDesign design1=new Samsung();
	design1.logoDesign();
	design1.faceAuthentication();
	design1.samsungNote();
}
public void shareDocument() {
	
}

@Override
public void logoDesign() {
System.out.println("Logo Design");
}

@Override
public void samsungNote() {
	System.out.println(" Samsung Note");
}

@Override
public void faceAuthentication() {
System.out.println("Face Authentication");
}
	
}
