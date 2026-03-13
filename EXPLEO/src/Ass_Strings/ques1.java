package Ass_Strings;
import java.util.Scanner;

public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		
		
		for(int i=0;i<input.length();i++) {
			int c=0;
			for(int j=0;j<i;j++) {
				if(input.charAt(i)==input.charAt(j)) {
					c=1;
					break;
					
		}		
					
			}
			if(c==0) {
				System.out.print(" "+input.charAt(i));
			}
			
			
		
		}
	}
}
				
			
			
			
		
		



