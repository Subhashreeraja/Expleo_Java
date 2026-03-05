package Control_flow_statements;
import java.util.Scanner;
public class Level2_Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        int letters = 0;
        int digits = 0;
        int others = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            } 
            else if (Character.isDigit(ch)) {
                digits++;
            } 
            else {
                others++;
            }
        }
        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Other Symbols: " + others);

	}

}
