package Ass_Array;
import java.util.Scanner;
public class Level2_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		
		System.out.println("Enter Array:"); 
		for(int i=0;i<n;i++) {
			 ar[i]=sc.nextInt();
		}
		System.out.println("Enter key:"); 
		int key=sc.nextInt();
		boolean found=false;
		for(int i=0;i<n;i++) {
			if(ar[i]==key) {
				found=true;
			}
		}
		if(found==true) {
			System.out.println(" "+found);
		}else {
			System.out.println(" "+found);
		}

	}

}
