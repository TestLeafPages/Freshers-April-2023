package week4.learnoops;

public class ParentClass extends GrandParentClass{
	
	public void buyNewLand() {
		System.out.println("Empty land");
	}
public static void main(String[] args) {
	ParentClass obj=new ParentClass();
	obj.bungalow();
	obj.car();
}
}
