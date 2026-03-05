package Arrays;
import java.util.Scanner;
public class twodimenArray_MBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[][] seatType=new String[4][5];
		System.out.println("Enter a seats in each type:");
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				seatType[i][j] =sc.nextLine();
			}
		}
		/*System.out.println("Print a seatType:");
	for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("  " +seatType[i][j] );
			}
			System.out.println();
		}*/
		int vipcount=0,premiumcount=0,regularcount=0,viptotal=5,premiumtotal=10,regulartotal=5;
	/*	for(int i=0;i<4;i++) {
			if(i==0)
				System.out.println("VIP SEATS");
			else if(i==1)
				System.out.println("PREMIUM SEATS");
			else if(i==3)
				System.out.println("REGULAR SEATS");
		}*/
			for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				//System.out.println(""+seatType[i][j]+" ");
				if(i==0 && seatType[i][j].equals("B"))
					vipcount++;
				else if(i>0 && i<3 && seatType[i][j].equals("B"))
					premiumcount++;
				else if(i==3 && seatType[i][j].equals("B"))
					regularcount++;
			}
			System.out.println();
		}
		System.out.println("SEAT BOOKED DETAIL");
		System.out.println("VIP SEATS");
		System.out.println("BOOKED:"+vipcount+"AVAILABLE:"+(viptotal-vipcount)+"TOTAl:"+viptotal);
		System.out.println("PREMIUM SEATS");
		System.out.println("BOOKED:"+premiumcount+"AVAILABLE:"+(premiumtotal-premiumcount)+"TOTAl:"+premiumtotal);
		System.out.println("REGULAR SEATS");
		System.out.println("BOOKED:"+regularcount+"AVAILABLE:"+(regulartotal-regularcount)+"TOTAl:"+regulartotal);
	}

}
