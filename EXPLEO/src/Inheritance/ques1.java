package Inheritance;

class Base {
	public Base() {
		System.out.print("Base");
	}
}

class Main extends Base {
	public Main() {
		this("Java");
		System.out.print("Derived");
	}

	public Main(String s) {
		System.out.print(s);
	}
}

public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
