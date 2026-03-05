package Arrays;
import java.util.Scanner;
public class JaggedArray_MBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of SeatType:");
		int x=sc.nextInt();
		
		String seatType[][] = new String[x][];
		
		
		
		//System.out.println("Enter a seatType:");
		for(int i=0;i<x;i++) {
			System.out.println("Enter No of Seats");
			int y=sc.nextInt();
			seatType[i] = new String[y];
			
			 for(int j=0;j<y;j++) {
				seatType[i][j] =sc.next();
			}
		}
		
		/*
		System.out.println("Print a seatType:");
		for(int i=0;i<x;i++) {
			for(int j=0;j<seatType[i].length;j++) {
				System.out.print(" "+seatType[i][j]);
			}
			System.out.println("");
		}*/
		sc.close();

	}

}
