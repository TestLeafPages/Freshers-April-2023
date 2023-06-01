package week4.learnoops;

import java.util.ArrayList;
import java.util.List;

public class StudentDetail {

	public void getStudentDetail(String name) {
		System.out.println(name);
	}
	public void getStudentDetail(int registerNumber) {
		System.out.println(registerNumber);
	}
	public void getStudentDetail(String mailId,int mobileNumber) {
		System.out.println(mailId +"   "+mobileNumber);
	}
	public void getStudentDetail(int mobileNumber,String mailId) {
		System.out.println(mailId +"   "+mobileNumber);
	}
	public static void main(String[] args) {
		StudentDetail std=new StudentDetail();
		std.getStudentDetail("Ravi");
		std.getStudentDetail(101);
		std.getStudentDetail("ravi@gmail.com",189377338);
		std.getStudentDetail(189377338,"ravi@gmail.com");
	
	}
}
