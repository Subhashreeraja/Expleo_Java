package Collections;
import java.util.*;
public class priorityqueue_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue <String> pq=new PriorityQueue<>();
		pq.add("c");
		pq.add("s");
		pq.add("f");
		pq.add("a");
		pq.add("g");
		System.out.println("Elements: ");
		System.out.println("Elements: "+pq);
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		System.out.println("Elements: "+pq);

	}

}
