package Ass_Array;

import java.util.Scanner;

public class Level1_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no[]=new int[10];
		for(int i=0;i<10;i++) {
			 no[i]=sc.nextInt();
			 
		}
			
		for(int i=0;i<10;i++) {
			if(no[i]==-1)
				continue;
			int c=1;
			for(int j=i+1;j<10;j++) {
				if(no[i]==no[j]) {
					c++;
					no[j]=-1;
				}
				
			}
			System.out.println(no[i]+"-> "+c);
				
			
		}

	}

}
