package Control_flow_statements;
import java.util.Scanner;
public class Level1_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);	
		
		 int c=0;
			 
		 while(true) {
			 int no=sc.nextInt();
			 if(no<0) {
				 break;
			 }
			 for(int i=1;i<=no;i++) {
				 System.out.println("Hello"); 
				 c++;
			 }
		 }
		 System.out.println("Total number of Hello displayed: "+c); 

	}

}
