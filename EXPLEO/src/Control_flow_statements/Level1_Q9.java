package Control_flow_statements;
import java.util.Scanner;
public class Level1_Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);	
		 System.out.println("Enter a number:");
		 int no=sc.nextInt();
		 int s=0;
		 while(no>0) {
			 int r=no%10;
			 s+=r;
			 no/=10;
		 }
		 System.out.println("Sum of digits of number: "+s);
	}

}
