package Ass_Functions;
import java.util.Scanner;
public class Level2_Q3 {
	public static void calculateOvertime(int emp[]) {
		int overtime=0,pay=0;
		for(int i=0;i<5;i++) {
			if(emp[i]>40) {
				overtime=emp[i]-40;
				pay=overtime*15;
				System.out.println("Employee "+(i+1)+" overtime pay is: "+pay);	
				}else {
					System.out.println("Employee " + (i+1) + "doesn't work in the overtime");	
				}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int emp[]=new int[5];
		for(int i=0;i<5;i++) {
			emp[i]=sc.nextInt();
		}
		calculateOvertime(emp);

	}

}
