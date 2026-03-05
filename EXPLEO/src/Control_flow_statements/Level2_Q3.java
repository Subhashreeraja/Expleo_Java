package Control_flow_statements;
import java.util.Scanner;
public class Level2_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);	
		 
		 System.out.println("Enter no of pages: ");
		 int page=sc.nextInt();
		 System.out.println("Enter no of copies: ");
		 int copy=sc.nextInt();
		 int typing=page*3;
		 int printing = 0;
		 if(copy==1) {
			 printing=page*1;
		 }else if(copy>1) {
			 printing=(page*1) + (page * (copy - 1) * 3);
		 }
		 int totalBill = typing + printing;

	        System.out.println("Typing cost: " + typing);
	        System.out.println("Printing cost: " + printing);
	        System.out.println("Total bill amount: " + totalBill);
	        sc.close();
		 
		 
		 
		 
		 
		 
		 
	}

}
