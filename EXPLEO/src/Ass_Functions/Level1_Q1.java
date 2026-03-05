package Ass_Functions;
import java.util.Scanner;
public class Level1_Q1 {
	
	public static void sumOddEven(int ar[]) {
		int sumOdd=0,sumEven=0;
		for(int i=0;i<7;i++){
			if(ar[i]%2==0) {
				sumEven+=ar[i];
				
			}else {
				sumOdd+=ar[i];
			}
		}
		System.out.println("Sum of Odd no: "+sumOdd);
		System.out.println("Sum of Even no: "+sumEven);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[7];
		System.out.print("Enter Array:"); 
		for(int i=0;i<7;i++) {
			 ar[i]=sc.nextInt();
		}
		sumOddEven(ar);

	}

}
