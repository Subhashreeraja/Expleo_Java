package Control_flow_statements;
import java.util.Scanner;
public class Level2_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);	
		 
		 System.out.println("Enter a month: ");
		 int month=sc.nextInt();
		 if(month<=0 && month>12) {
			 System.out.println("Invalid month.Program terminated ");
		 }
		 System.out.println("Enter a starting day: ");
		 int startday=sc.nextInt();
		 int days=0;
		 if(month==2) {
			 System.out.println("Enter a days in feburary(28 or 29):");
			 days=sc.nextInt();	 
		 }else if(month==4|| month==6||month==9||month==11) {
			 days=30;
		 }else {
			 days=31;
		 }
		 System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		 for(int i=1;i<startday;i++) {
			 System.out.print(" ");
			 }
		 

	}

}
