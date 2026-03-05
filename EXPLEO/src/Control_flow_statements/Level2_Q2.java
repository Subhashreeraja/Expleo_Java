package Control_flow_statements;
import java.util.Scanner;
public class Level2_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);	
		 System.out.println("Enter the price per item:");
		 int price=sc.nextInt();
		 System.out.println("Enter the purchased quantity:");
		 int quantity=sc.nextInt();
		 int expense=price*quantity;
		 int dis;
		 if(quantity>500) {
			 dis=(15/100)*expense;
			 expense-=dis;
			 System.out.println("Total expense is: "+expense);
		 }else {
			 System.out.println("Total expense is: "+expense);
		 }

	}

}
