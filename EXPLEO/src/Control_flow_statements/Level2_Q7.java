package Control_flow_statements;
import java.util.Scanner;
public class Level2_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Basic Salary: ");
	        double basicSalary = sc.nextDouble();
	        double hra, da;
	        if (basicSalary <= 10000) {
	            hra = basicSalary * 0.20;
	            da = basicSalary * 0.80;
	        } 
	        else if (basicSalary <= 20000) {
	            hra = basicSalary * 0.25;
	            da = basicSalary * 0.90;
	        } 
	        else {
	            hra = basicSalary * 0.30;
	            da = basicSalary * 0.95;
	        }
	        double grossSalary = basicSalary + hra + da;
	        System.out.println("HRA: " + hra);
	        System.out.println("DA: " + da);
	        System.out.println("Gross Salary: " + grossSalary);
	}

}
