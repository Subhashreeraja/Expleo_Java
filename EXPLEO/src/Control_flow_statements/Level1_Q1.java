package Control_flow_statements;
import java.util.Scanner;
public final class Level1_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);	
        System.out.println("Enter a employee name:");
        String empName=sc.nextLine();
        System.out.println("Enter a wage per day:");
        int wages=sc.nextInt();
        System.out.println("Enter a Number of days worked:");
        int days=sc.nextInt();
        int ts=wages*days;
        System.out.println("Total salary: "+ts);

        sc.close();
	}

}
