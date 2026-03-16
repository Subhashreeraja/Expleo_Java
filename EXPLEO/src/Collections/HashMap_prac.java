package Collections;
import java.util.*;
public class HashMap_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Double> hm=new HashMap<String,Double>();
		System.out.println("Size of the hashMap is: "+hm.size());
		hm.put("Subha", 31000.00);
		hm.put("Tom Cruise", 14000.00);
		hm.put("Mathew", 13000.00);
		hm.put("Smith", 12000.00);
		System.out.println("Elements in the Map");
		System.out.println("Size of the Map"+hm.size());
		Set<Map.Entry<String,Double>>set=hm.entrySet();
		for(Map.Entry<String,Double>me:set) {
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}

	}

}
