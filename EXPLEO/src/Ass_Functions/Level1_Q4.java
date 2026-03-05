package Ass_Functions;
import java.util.Scanner;
public class Level1_Q4 {
	public static void vote(int age) {
		if(age>=18) {
			System.out.println("Eligible to vote");
		}else {
			System.out.println("Not Eligible to vote");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		vote(age);

	}

}
