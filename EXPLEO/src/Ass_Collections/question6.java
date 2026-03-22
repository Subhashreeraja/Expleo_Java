package Ass_Collections;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;

	class Person {
	    String firstName;
	    String lastName;

	    // Constructor
	    Person(String firstName, String lastName) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	    }

	    // Display method
	    public String toString() {
	        return firstName + " " + lastName;
	    }
	}

	public class question6 {
	    public static void main(String[] args) {
	        ArrayList<Person> people = new ArrayList<>();

	        people.add(new Person("Shree", "Subha"));
	        people.add(new Person("Tom", "Cruise"));
	        people.add(new Person("John", "Mathew"));

	        // Sort by first name
	        Collections.sort(people, new Comparator<Person>() {
	            public int compare(Person p1, Person p2) {
	                return p1.firstName.compareTo(p2.firstName);
	            }
	        });

	        System.out.println("Sorted people by first name:");
	        for (Person p : people) {
	            System.out.println(p);
	        }
	    }
	}


