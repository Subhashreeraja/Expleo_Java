package generics;
class Test<T,U,R>{
	T obj1;
	U obj2;
	R obj3;
	Test(T obj1,U obj2,R obj3){
		this.obj1=obj1;
		this.obj2=obj2;
		this.obj3=obj3;
	}
	public void display() {
		System.out.println(" "+obj1);
		System.out.println(" "+obj2);
		System.out.println(" "+obj3);
	}
}
public class multi_generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test<Integer,String,Integer> object=new Test<>(1,"Subhashree",20) ;
		object.display();

	}

}
