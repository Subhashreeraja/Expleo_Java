package generics;

public class generic_method_example {
	static <T> void genericDisplay(T element) {
		System.out.println(element);
		System.out.println(element.getClass().getName()+"="+element);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genericDisplay(11);
		genericDisplay("Subhashree");
		genericDisplay(3.0f);

	}

}
