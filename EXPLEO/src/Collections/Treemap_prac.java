package Collections;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class Treemap_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Double> hm=new TreeMap<String,Double>();
		System.out.println("Size of the hashMap is: "+hm.size());
		hm.put("John Doe", 4343.43);
		hm.put("Tom Smith", 145.23);
		hm.put("Jane Baker", 1450.78);
		hm.put("Ralph Smith", 18.76);
		System.out.println("Elements in the Map");
		System.out.println("Size of the Map"+hm.size());
		Set<Map.Entry<String,Double>>set=hm.entrySet();
		for(Map.Entry<String,Double>me:set) {
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}

	}

}
