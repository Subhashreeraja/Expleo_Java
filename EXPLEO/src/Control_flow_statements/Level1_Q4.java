package Control_flow_statements;
import java.util.Scanner;
public class Level1_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);	
		 System.out.println("Enter a number:");
          int i=sc.nextInt();
          int j=1;
          do{
        		 System.out.println(" "+j);
        		 j++;
        	  
          }while(j<=i);
        	 
          
	}

}
