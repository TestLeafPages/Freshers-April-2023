package week1.day3;

public class StudentDetails {

	public void getStudentName(String name) {
		System.out.println("name: "+name);
	}
	public void getStudentRegisterNumber(int number) {
		System.out.println("number: "+number);
	}
	public void getStudentAddress(String address) {
		System.out.println(address);
	}
	public void getStudentMobileNumber(long mobile) {
		System.out.println("mobile: "+mobile);
	}
	public static void main(String[] args) {
		StudentDetails student=new StudentDetails();
		student.getStudentName("Arun");
		student.getStudentRegisterNumber(103234232);
		student.getStudentAddress("Chennai");
		student.getStudentMobileNumber(973646346663L);
		
	}
}
