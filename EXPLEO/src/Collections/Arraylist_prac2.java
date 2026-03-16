package Collections;
import java.util.*;
public class Arraylist_prac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> Arr=new ArrayList<Integer>();
		System.out.println("Intial Size of Array list is: "+Arr.size());
		Arr.add(9);
		Arr.add(0);
		Arr.add(8);
		Arr.add(0);
		Arr.add(5);
		Arr.add(3);
		Arr.add(3);
		System.out.println("After Insert Size of Array list is: "+Arr.size());
		System.out.println(" "+Arr);
		Arr.remove(0);
		System.out.println(" "+Arr);
		Integer ia[]=new Integer[Arr.size()];
		ia=Arr.toArray(ia);
		int sum=0;
		for(int i:ia) {
			sum+=i;
		}
		System.out.println("Sum value:  "+sum);
	

	}

}
