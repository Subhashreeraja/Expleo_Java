package Ass_Functions;
import java.util.Scanner;
public class Level3_Q2 {
	
	public static void max(int cs,int ec,int me) {
		if(cs<0 || ec<0 || me<0) {
			System.out.println("Input is invalid");
		}
		else if(cs==ec &&ec==me  && me==cs) {
			System.out.println("None of the department has got the highest placement");
		}
		
	    else if(cs>ec && cs>me) {
			System.out.println("Highest Placement CS");
		}
		else if(ec>cs && ec>me) {
			System.out.println("Highest Placement EC");
		}
		else if(me>cs && me>ec){
			System.out.println("Highest Placement ME");
		}else if(cs==ec && cs>me) {
			System.out.println("Highest Placement CS EC");
		}
		else if( ec==me && ec>cs) {
			System.out.println("Highest Placement EC ME");
		}else if(me==cs && cs>ec) {
			System.out.println("Highest Placement CS ME");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of students placed in CS: ");
		int cs=sc.nextInt();

		System.out.println("Enter the no of students placed in EC: ");
		int ec=sc.nextInt();
		
		System.out.println("Enter the no of students placed in ME: ");
		int me=sc.nextInt();
		
		max(cs,ec,me);
	}

}
