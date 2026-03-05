package Control_flow_statements;
import java.util.Scanner;
public class Level1_Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);	
		 int n=sc.nextInt();
		 int s=1;
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=i;j++) {
				 
				 System.out.print(" "+s);
				 
			 }
			 s++;
			 System.out.println(); 
		 }

	}

}
