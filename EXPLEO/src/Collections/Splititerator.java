package Collections;

import java.util.ArrayList;
import java.util.Spliterator;

public class Splititerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> Arr=new ArrayList<Integer>();
		System.out.println("Intial Size of Array list is: "+Arr.size());
		Arr.add(9);
		Arr.add(0);
		Arr.add(8);
		Arr.add(0);
		Arr.add(5);	
		System.out.println("Content try advance");
		Spliterator<Integer>sitr=Arr.spliterator();
		while(sitr.tryAdvance((n)->System.out.println(n+" ")));
		System.out.println();
		System.out.println("Content for each remaining");
		sitr=Arr.spliterator();
		sitr.forEachRemaining((n)->System.out.println(n+" "));
		System.out.println();
		System.out.println("After insert Size of Array list is: "+Arr.size());
	}

}
