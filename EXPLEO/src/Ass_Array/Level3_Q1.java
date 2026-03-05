package Ass_Array;
import java.util.Scanner;
public class Level3_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Input number of friends
	        int N = sc.nextInt();

	        int[] chocolates = new int[N];
	        int total = 0;

	        // Input chocolates
	        for(int i = 0; i < N; i++) {
	            chocolates[i] = sc.nextInt();
	            total += chocolates[i];
	        }

	        // Check if equally divisible
	        if(total % N == 0) {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        }

	        sc.close();

	}

}
