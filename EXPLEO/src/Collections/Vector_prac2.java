package Collections;
import java.util.*;
public class Vector_prac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<String>();
		System.out.println("Initial vector size:"+v.size());
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("E");
		System.out.println("Elements in the vector:"+v);
		System.out.println(" Vector size:"+v.size());
		System.out.println(" Vector size:"+v.capacity());
		
	}

}
