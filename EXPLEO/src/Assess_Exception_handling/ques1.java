package Assess_Exception_handling;
import java.util.Scanner;

public class ques1 {
	
    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Read inputs until no more integers are available
	        while (sc.hasNextInt()) {

	            int n = sc.nextInt(); // base
	            int p = sc.nextInt(); // power

	            try {

	                // Condition 1: both n and p are zero
	                if (n == 0 && p == 0) {
	                    throw new Exception("n and p should not be zero.");
	                }

	                // Condition 2: if n or p is negative
	                if (n < 0 || p < 0) {
	                    throw new Exception("n or p should not be negative.");
	                }

	                // Calculate n^p
	                long result = 1;

	                for (int i = 0; i < p; i++) {
	                    result = result * n;
	                }

	                // Print result
	                System.out.println(result);

	            } catch (Exception e) {

	                // Print exception message
	                System.out.println(e);
	            }
	        }

	        sc.close();
	    }
	}


