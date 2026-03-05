package Control_flow_statements;
import java.util.Scanner;
public class Level2_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);	
		 
		 System.out.println("Enter hour: ");
		 int hours=sc.nextInt();
		 System.out.println("Enter min: ");
		 int minutes=sc.nextInt();
		
		 if (hours > 7 || (hours == 7 && minutes > 0)) {
	            System.out.println("User can only browse maximum 7 hrs");
	        }
	 
	        else if (hours == 5 && minutes == 0) {
	            System.out.println("Total bill amount: Rs. 200");
	        }
	  
	        else {
	            int totalAmount = (hours * 50) + minutes;
	            System.out.println("Total bill amount: Rs. " + totalAmount);

	}

	}
}
