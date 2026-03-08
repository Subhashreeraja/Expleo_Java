package InnerClassess;

class Person{
	int age=21;
	static int weight=45;
	static class Gender{
		void nonStaticDisplay() {
			System.out.println("In NonStatic Display method");
			System.out.println("Weight Value:"+weight);
			
		}
		static void staticDisplay() {
			System.out.println("In Static Display method");
			System.out.println("Weight Value:"+weight);
		}
	}
	Gender gender=new Gender();
}

public class static_nested_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		person.gender.nonStaticDisplay();
		Person.Gender.staticDisplay();

	}

}
