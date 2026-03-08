package InnerClassess;

class Outer{
	int value=56;
	public void outerClassMethod() {
		System.out.println("Inside the method of Outer class");
		class Inner{
			public void innerClassMethod() {
				System.out.println("Inside the method of Inner class");
				System.out.println("Value: "+value);
			}
		}
		Inner inner=new Inner();
		inner.innerClassMethod();
	}
}

public class method_local {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer=new Outer();
		outer.outerClassMethod();

	}

}
