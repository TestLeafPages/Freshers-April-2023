package week1.day3;

public class Calculator {

	public void addTwoNumber(int a , int b) {
		
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Calculator calc=new Calculator();

		calc.addTwoNumber(10,10);
		calc.addTwoNumber(100,100);
		calc.addTwoNumber(1000,1000);
		calc.addTwoNumber(50,50);
	
		
	}
}
