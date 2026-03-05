package Training;

import java.util.Scanner;

public class if_for_MBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean seatAvailabe=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Seat Number:");
		String seatno=sc.nextLine();
		if(seatAvailabe) {
			System.out.println("You have booked the seat number: "+seatno);
		}

	}

}
