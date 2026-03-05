package Ass_Functions;

import java.util.Scanner;

public class Level1_Q2 {
public static void prime(int a,int b) {
		
		for(int i=a;i<b;i++) {
			
			if(i<=1) {
				continue;
			}
				boolean isprime=true;
		    for(int j=2;j<=Math.sqrt(i);j++) {
					if(i%j==0) {
						isprime=false;
						break;
					}
				}
		    if(isprime) {
		    	System.out.print(" "+i);
		    }		
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		prime(a,b);
	}

}
