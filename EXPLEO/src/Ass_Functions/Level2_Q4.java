package Ass_Functions;
import java.util.Scanner;
public class Level2_Q4 {
	public static void eligible(int age,int weight) {
		if(age>18 && age<55) {
			if(weight>45) {
				System.out.println("Blood done is eligble for donating blood");
			}else {
				System.out.println("Blood done is not eligble for donating blood");
			}
		}else{
			System.out.println("Blood done is not  eligble for donating blood");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int weight=sc.nextInt();
		eligible(age,weight);

	}

}
