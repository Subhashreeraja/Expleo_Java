package Ass_Array;
import java.util.Scanner;
public class Level1_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int no[]=new int[10];
		
		for(int i=0;i<10;i++) {
			 no[i]=sc.nextInt();
			 
		}
		for(int i=0;i<10;i++) {
			for(int j=i+1;j<10;j++) {
				if(no[i]>no[j]) {
					int temp=no[i];
					no[i]=no[j];
					no[j]=temp;
				}
			}
		}
		for(int i=0;i<10;i++) {
			System.out.print(" "+no[i]);
		}
		

	}

}
