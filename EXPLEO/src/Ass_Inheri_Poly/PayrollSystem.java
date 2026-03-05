package Ass_Inheri_Poly;



public class PayrollSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Main class to test polymorphism
		        Employee permanentEmp =
		                new PermanentEmployee("E101", "Aruna", 30000, 5000);

		        Employee contractEmp =
		                new ContractEmployee("E102", "Balaji", 25000, 0.10, 1000);

		        Employee internEmp =
		                new Intern("E103", "Chitra", 12000);

		        // Polymorphic method calls
		        System.out.println(permanentEmp);
		        System.out.println("---------------------");
		        System.out.println(contractEmp);
		        System.out.println("---------------------");
		        System.out.println(internEmp);
		        }
		

	

}
