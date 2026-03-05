package Control_flow_statements;
import java.util.Scanner;
import java.util.Arrays;
public class Level3_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter characters: ");
	        String input = sc.nextLine();

	        char[] chars = input.toCharArray();
	        Arrays.sort(chars);

	        System.out.print("Sorted Output: ");
	        for (char c : chars) {
	            System.out.print(c);
	        }

	}

}
