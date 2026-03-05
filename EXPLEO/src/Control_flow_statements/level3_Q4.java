package Control_flow_statements;
import java.util.Scanner;
public class level3_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double totalCost = sc.nextDouble();
        double discountRate = 0;

        if (totalCost < 2000) {
            discountRate = 0.05;
        } else if (totalCost < 5000) {
            discountRate = 0.25;
        } else if (totalCost < 10000) {
            discountRate = 0.35;
        } else {
            discountRate = 0.50;
        }

        double discountAmount = totalCost * discountRate;
        double amountToPay = totalCost - discountAmount;

        System.out.println(amountToPay);

	}

}
