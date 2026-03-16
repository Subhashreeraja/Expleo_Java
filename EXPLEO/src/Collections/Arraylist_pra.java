package Collections;
import java.util.*;
/*Practice the Arraylist in the Collection*/
public class Arraylist_pra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>Arr=new ArrayList<String>();
		System.out.println("Intial Size of Array list is: "+Arr.size());
		Arr.add("S");
		Arr.add("M");
		Arr.add("B");
		Arr.add("H");
		Arr.add("A");
		Arr.add("T");
		Arr.add("V");
		Arr.add(1,"U");
		System.out.println("After Insert Size of Array list is: "+Arr.size());
//for(String s:Arr) {
			
			//System.out.println(" "+s);
		//}
System.out.println(" "+Arr);
		Arr.remove(2);
		Arr.remove("T");
		Arr.remove("V");
		System.out.println("After Remove Size of Array list is: "+Arr.size());
		for(String s:Arr) {
			
			System.out.println(" "+s);
		}

	}

}
