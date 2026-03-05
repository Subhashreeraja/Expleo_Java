package Ass_Functions;

import java.util.Scanner;

public class Level1_Q3 {
	public static void calNewSalary(int salary,int hike) {
		float newSalary=salary+(salary*hike/100);
		System.out.println("New Salary: "+newSalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int salary=sc.nextInt();
		int hike=sc.nextInt();
		calNewSalary(salary,hike);
		


	}

}
