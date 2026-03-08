package Inheritance;

class Base1 {
	int i;
	void display() {
		System.out.println(i);
	}
	
}

class Derived1 extends Base1 {
	int j;
	void display(){
	super.display();
	System.out.println(j);
}

}

public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived1 obj=new Derived1();
		obj.i=5;
		obj.display();
		obj.j=10;
		obj.display();

	}

}
