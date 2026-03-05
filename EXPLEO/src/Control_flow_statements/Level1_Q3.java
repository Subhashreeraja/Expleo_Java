package Control_flow_statements;
import java.util.Scanner;
public class Level1_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);	
		 System.out.println("Enter a char:");
		 char ch=sc.next().charAt(0);
		 switch(ch) {
		 case 'a','e','i','o','u', 'A','E','I','O','U':
			 System.out.println("Entered character is a vowel");
		 break;
		 
		 default:
			 if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z')) {
				 System.out.println("Entered character is a consonant");
			 }else {
				 System.out.println("Entered character is a symbol");
			 }
		 
		 }
	}

}
