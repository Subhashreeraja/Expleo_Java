package Control_flow_statements;
import java.util.Scanner;
public class Level2_Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;      
            sum = sum + (digit * digit * digit);
            num = num / 10;           
        }

        if (sum == temp) {
            System.out.println(temp+ " is an Armstrong number");
        } else {
            System.out.println(temp + " is not an Armstrong number");

	}

}
}
