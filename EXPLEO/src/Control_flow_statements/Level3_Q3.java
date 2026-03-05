package Control_flow_statements;
import java.util.Scanner;
public class Level3_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the car no: ");
        int num = sc.nextInt();
        if (num < 1000 || num > 9999) {
            System.out.println(num + " is not a valid car number");
            return;
        }
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            sum =sum+temp % 10;
            temp /= 10;
        }
        if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
            System.out.println("Lucky Number");
        } else {
            System.out.println("Sorry it’s not my lucky number");
        }

	}

}
