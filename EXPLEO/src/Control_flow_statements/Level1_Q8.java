package Control_flow_statements;
import java.util.Scanner;
public class Level1_Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);	
		 System.out.println("Enter a character: ");
		 char ch=sc.next().charAt(0);
		 if(ch>='0' && ch<='9') {
			 System.out.println("Entered character is a digit");
		 }else if((ch>='a'&& ch<='z')||(ch>='A' && ch<='Z')){
			 System.out.println("Entered character is a Letter");
		 }else {
			 System.out.println("Entered character is a symbol");
		 }

	}

}
