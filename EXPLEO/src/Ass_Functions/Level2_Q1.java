package Ass_Functions;

import java.util.Scanner;

public class Level2_Q1 {
	public static int even(int a,int b) {
		int sumEven=0;
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				sumEven+=i;
			}
		}
		return sumEven;
	}
	
	public static int odd(int a,int b) {
		int sumOdd=0;
		for(int i=a;i<=b;i++) {
			if(i%2!=0) {
				sumOdd+=i;
			}
		}
		return sumOdd;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sumEven=even(a,b);
		int sumOdd=odd(a,b);
		
		System.out.println("The sum of odd numbers from "+a+" to "+b+" is: "+sumOdd);
		System.out.println("The sum of even numbers from "+a+" to "+b+" is: "+sumEven);
		
		int diff=sumEven-sumOdd;
		System.out.println("The absolute difference between the two sums is: "+Math.abs(diff));
		

	}

}
