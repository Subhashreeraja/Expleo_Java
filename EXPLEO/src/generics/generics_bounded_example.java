package generics;

public class generics_bounded_example {
	
	static <T extends Number> T display(T one,T two) {
		return (T)(Integer)(one.intValue()+two.intValue());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(display(11,12));
		System.out.println(display("subha","learning"));
	}
	
	}


