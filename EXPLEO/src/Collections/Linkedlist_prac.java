package Collections;

import java.util.*;

public class Linkedlist_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		System.out.println("Intial Size of Array list is: " + list.size());
		list.add("Java");
		list.add("C");
		list.add("Python");
		list.addFirst("JavaScript");
		list.addLast("C++");
		list.add(2, "C#");
		System.out.println("Original linked list:" + list);
		System.out.println("Intial Size of Array list is: " + list.size());
		list.remove(5);
		list.remove("C#");
		System.out.println("New linked list:" + list);
		System.out.println( "Size after removal: "+list.size());

	}

}
