package InnerClassess;


class OuterClass{
	int age=18;
	public void checkage() {
		System.out.println("..age..");
	}
	class InnerClass{
		 void display() {
			 System.out.println("...");
		 }
	}
}


public class regular_inner_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outer=new OuterClass();
		outer.checkage();
		OuterClass.InnerClass inner=outer.new InnerClass();
		inner.display();

	}

}
