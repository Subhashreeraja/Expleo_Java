package Training;

public class Type_promotion_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=42;
		char c='s';
		short s=2005;
		int i=60000;
		float f=6.232f;
		double d=.1234;
		double res=(f*b)+(i/c)-(d*s);
		System.out.println("result="+res);
		

	}

}
