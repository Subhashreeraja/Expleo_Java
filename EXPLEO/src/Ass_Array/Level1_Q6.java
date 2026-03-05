package Ass_Array;
import java.util.Scanner;
public class Level1_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[5];
		System.out.print("Enter Array:"); 
		for(int i=0;i<5;i++) {
			 ar[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			if(ar[i]==-1) 
				continue;
			for(int j=i+1;j<5;j++) {
				if(ar[i]==ar[j]) {
					System.out.print("\nDuplicate no: "+ar[i]);
					ar[j]=-1;
				}
				
			}
		}

	}

}
