package Ass_Array;
import java.util.Scanner;
public class level3_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arun = {5, 6, 2, 1, 2, 5, 6, 3, 4, 2};
	        int[] naveen = {5, 5, 4, 3, 3, 5, 6, 2, 1, 1};

	        int arunTotal = 0;
	        int naveenTotal = 0;

	        // Calculate Arun's total
	        for(int i = 0; i < arun.length; i++) {
	            arunTotal += arun[i];
	        }

	        // Calculate Naveen's total
	        for(int i = 0; i < naveen.length; i++) {
	            naveenTotal += naveen[i];
	        }

	        System.out.println("Arun Total: " + arunTotal);
	        System.out.println("Naveen Total: " + naveenTotal);

	        // Decide Winner
	        if(arunTotal > naveenTotal) {
	            System.out.println("Arun Wins!!!");
	        } 
	        else if(naveenTotal > arunTotal) {
	            System.out.println("Naveen Wins!!!");
	        } 
	        else {
	            System.out.println("Match Draw!!!");
	        }

	}

}
