package Ass_Functions;
import java.util.Scanner;
public class Level3_Q1 {
	public static  void incre_ten(int salary) {
		double dis=salary*0.10;
		System.out.println("Increment Salary is: "+(int)(salary+dis));	
	}
	public static  void incre_twentyFive(int salary) {
		double dis=salary*0.25;
		System.out.println("Increment Salary is: "+(int)(salary+dis));	
	}
	
	public static  void incre_thirty(int salary) {
		double dis=salary*0.30;
		System.out.println("Increment Salary is: "+(int)(salary+dis));	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary: ");
		int salary=sc.nextInt();
		System.out.println("Enter the appraisal rating: ");
		float rating=sc.nextFloat();
		if(salary<=0 || rating<1 && rating >10) {
			System.out.println("Invalid Input ");
			
		}
		if(rating>=1 && rating <=4) {
			incre_ten(salary);
		}
		if(rating>=4.1 && rating <=7) {
			incre_twentyFive(salary);
		}
		if(rating>=7.1 && rating <=10) {
			incre_thirty(salary);
		}
		

	}

}
