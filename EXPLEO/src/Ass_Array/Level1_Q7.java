package Ass_Array;
import java.util.Scanner;
public class Level1_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[5];
		System.out.print("Enter Array1:"); 
		for(int i=0;i<5;i++) {
			 ar[i]=sc.nextInt();
		}
		
		int arr[]=new int[5];
		System.out.print("Enter Array2:"); 
		for(int i=0;i<5;i++) {
			 arr[i]=sc.nextInt();
			 
		}
		
		int merge[]=new int[10];
		int k=0;
		for(int i=0;i<5;i++) {
			merge[k++]=ar[i];
		}
		for(int i=0;i<5;i++) {
			merge[k++]=arr[i];
		}
		System.out.println("Print Array1:");
		for(int i=0;i<5;i++) {
			System.out.print(" "+ar[i]);
		}
		System.out.println("\nPrint Array2:");
		for(int i=0;i<5;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println("\nMerge Array:");
		for(int i=0;i<10;i++) {
			System.out.print(" "+merge[i]);
		}
		
		
		
		
		
		
		
		
	}

}
