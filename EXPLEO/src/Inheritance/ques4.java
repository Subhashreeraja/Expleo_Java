package Inheritance;

class Base5 {
	int i;
	void display() {
		System.out.println(i);
	}
	
}

class Derived3 extends Base5{
	int j;
	void display(){
	System.out.println(j);
}

}


public class ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived3 obj=new Derived3();
		obj.i=5;
		//obj.display();
		obj.j=10;
		obj.display();


	}

}
