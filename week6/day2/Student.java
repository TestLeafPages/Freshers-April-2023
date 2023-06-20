package week6.day2;

public class Student{
	String studentName;
	int registerNumber;
	String address;

	Student(){
		System.out.println("Default Constructor");
	}
	
	
	Student(String studentName,int registerNumber,String address){
		this();
		System.out.println("Parameterized  Constructor");
		this.studentName=studentName;
		this.registerNumber=registerNumber;
		this.address=address;
		System.out.println(studentName);
		System.out.println(registerNumber);
		System.out.println(address);
	}

	
	public static void main(String[] args) {
		Student std=new Student("Anil",101,"Chennai");
		Student std1=new Student();
		
	}
}
