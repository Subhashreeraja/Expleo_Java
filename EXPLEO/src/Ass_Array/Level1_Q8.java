package Ass_Array;
import java.util.Scanner;
public class Level1_Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[4];
		System.out.println("Enter Array:"); 
		for(int i=0;i<4;i++) {
			 ar[i]=sc.nextInt();
		}
		int j=1;
		boolean found=false;
		for(int i=0;i<4;i++) {
			if(ar[i]!=j) {
				System.out.println("Missing no is: "+j);
				found=true;
				break;
				
			}
			j++;
		}
		if(!found) {
			System.out.println("Missing no is: "+j);
		}

	}

}
