package Training;
import java.util.Scanner;
public class if_elseif_else_for_MBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String seattype;
		System.out.println("Types of seats Avalaible\nREGULAR\nPREMIUM\nEXECUTIVE\nVIP\nchoose any one of the option:");
		seattype=sc.nextLine();
		if(seattype.equals("REGULAR")) {
			System.out.println("You have selected Regular Seat and cost is Rs.80");
		}else if(seattype.equals("PREMIUM")) {
			System.out.println("You have selected PREMIUM Seat and cost is Rs.100");
		}
		else if(seattype.equals("EXECUTIVE")) {
			System.out.println("You have selected EXECUTIVE Seat and cost is Rs.120");
			
		}else if(seattype.equals("VIP")) {
			System.out.println("You have selected VIP Seat and cost is Rs.150");
		}else {
			System.out.println("You have not selected any type");
		}

	}

}
