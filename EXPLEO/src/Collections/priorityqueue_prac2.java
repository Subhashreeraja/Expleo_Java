package Collections;
import java.util.*;
class Task implements Comparable<Task> {
	private String name;
	private int priority;

	public Task(String name, int priority) {
		this.name = name;
		this.priority = priority;
	}



	public String getName() {
		return name;
	}

	public int getPriority() {
		return priority;
	}

	public int compareTo(Task other) {
		return Integer.compare(other.priority, this.priority);
	}
}


public class priorityqueue_prac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  PriorityQueue<Task> pq=new PriorityQueue<>();
  pq.add(new Task("Task 1",3));
  pq.add(new Task("Task 2",1));
  pq.add(new Task("Task 3",2));
  while(!pq.isEmpty()) {
		Task task=pq.poll();
		System.out.println("Executing:"+task.getName()+"(Priority:"+task.getPriority()+")");
		
	}
	}

}
