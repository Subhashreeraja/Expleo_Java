package Collections;
import java.io.*;
import java.util.*;
class Mobile implements Comparable<Mobile>{
	private String name;
	private int ram;
	private int price;
	Mobile(String name,int ram,int price){
		this.name=name;
		this.ram=ram;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int compareTo(Mobile o) {
		if(this.ram>o.getRam()) return 1;
		else return -1;
	}
}
public class Comparable_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Mobile>mobileList=new ArrayList<>();
		mobileList.add(new Mobile("Vivo",16,18000));
		mobileList.add(new Mobile("Oppo",8,14000));
		mobileList.add(new Mobile("Redmi",4,12000));
		Collections.sort(mobileList);
		System.out.println("Mobiles after sorting:");
		System.out.println("Name"+"\t"+"Ram"+"\t"+"Price");
		for(Mobile mb:mobileList) {
			System.out.println(mb.getName()+"\t"+mb.getRam()+"\t"+mb.getPrice());
		}
		

	}

}
