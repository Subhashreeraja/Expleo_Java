package Control_flow_statements;

import java.util.Scanner;

public class Level1_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);	
		 int age=sc.nextInt();
		 int weight=sc.nextInt();
		 if(age>18 && age<55) {
			 if(weight>45) {
				 System.out.println("Blood donor is eligible");
			 }else {
				 System.out.println("Blood donor is not  eligible");
			 }
		 }else {
			 System.out.println("Blood donor is not  eligible");
		 }
	}

}
