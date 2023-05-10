package week1.day3;

public class MyCalculator {

	public int addTwoNumber(int a , int b) {
		int c=a+b;
		return c;
	}
	public void subractTwoNumber(int total, int b) {
		int c=total-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		MyCalculator calc=new MyCalculator();
        int total = calc.addTwoNumber(100,100);
		System.out.println(total);
		calc.subractTwoNumber(total, 20);
		
	}
}
