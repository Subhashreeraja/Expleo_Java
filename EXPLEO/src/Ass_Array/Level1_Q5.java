package Ass_Array;

import java.util.Scanner;

public class Level1_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[5];
		System.out.print("Enter Array:"); 
		for(int i=0;i<5;i++) {
			 ar[i]=sc.nextInt();
		}
		int max=ar[0];
		
		for(int i=0;i<5;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		System.out.println("Max: "+max); 
		

	}

}
