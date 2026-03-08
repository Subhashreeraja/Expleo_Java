package Inheritance;

class Base3 {
	public void displayBase() {
	System.out.println("Base class Method");
	}
	
}

class Main1 extends Base {
	public void displayDerived() {
	System.out.println("Derived class Method");
	}
	public Main1(String s) {
		System.out.print(s);
	}
	
}


public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main1 o=new Main1();
	}

}
