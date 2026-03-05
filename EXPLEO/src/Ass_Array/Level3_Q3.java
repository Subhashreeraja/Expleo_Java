package Ass_Array;
import java.util.Scanner;
public class Level3_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        int[] arr = new int[100];   // temporary size
	        int count = 0;

	        int num;

	        // Read until negative number
	        while (true) {
	            num = sc.nextInt();
	            if (num < 0)
	                break;

	            arr[count] = num;
	            count++;
	        }

	        processArray(arr, count);

	        // Print modified array
	        for (int i = 0; i < count; i++) {
	            System.out.print(arr[i] + " ");
	        }

	        sc.close();
	    }

	    // You modify only this method
	    public static void processArray(int[] arr, int size) {

	        for (int i = 0; i < size; i++) {

	            if (arr[i] % 7 == 0 && arr[i] % 8 == 0) {
	                arr[i] = -6;   // both black and white
	            }
	            else if (arr[i] % 7 == 0) {
	                arr[i] = -2;   // black
	            }
	            else if (arr[i] % 8 == 0) {
	                arr[i] = -9;   // white
	            }
	        }

	}

}
