package Control_flow_statements;
import java.util.Scanner;
public class Level3_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int in=sc.nextInt();
		int mul=1;
		int i=1;
		if(in<=0) {
			System.out.println("Invalid Input");
		}
		else {
			while(mul<in) {
				i++;
				mul*=i;	
			}			
			if(mul==in) {
				System.out.print(" "+i);
			}else {
				System.out.println("Sorry.The given number is not a perfect factorial");
			}
		}
		sc.close();
		
        
        

	}

}
