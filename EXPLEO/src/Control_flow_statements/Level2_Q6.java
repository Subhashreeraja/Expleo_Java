package Control_flow_statements;
import java.util.Scanner;
public class Level2_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Scanner sc = new Scanner(System.in);

	        System.out.print("Enter price: ");
	        double price = sc.nextDouble();

	        System.out.print("Enter quantity: ");
	        int quantity = sc.nextInt();

	        double purchaseAmount = price * quantity;
	        double discount;

	        if (purchaseAmount > 1000) {
	            discount = purchaseAmount * 0.10;
	        } else {
	            discount = purchaseAmount * 0.05;         
	        }

	        double paidAmount = purchaseAmount - discount;

	        System.out.println("Purchase Amount: " + purchaseAmount);
	        System.out.println("Paid Amount: " + paidAmount);
	
	
	}

}
