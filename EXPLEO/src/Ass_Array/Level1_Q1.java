package Ass_Array;
import java.util.Scanner;
public class Level1_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no[]=new int[10];
		int eve[]=new int[10];
		int odd[]=new int[10];
		int e=0,o=0;
		for(int i=0;i<10;i++) {
			 no[i]=sc.nextInt();
			 
		}
		for(int i=0;i<10;i++) {
			if(no[i]%2==0) {
				eve[e++]=no[i];
			}else {
				odd[o++]=no[i];
			}
		}
		for(int i=0;i<e;i++) {
			System.out.print("Even: "+eve[i]);
		}
		for(int i=0;i<o;i++) {
			System.out.print("Odd: "+odd[i]);
		}
		
		
		

	}

}
