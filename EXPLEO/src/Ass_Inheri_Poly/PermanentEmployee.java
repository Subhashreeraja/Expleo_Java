package Ass_Inheri_Poly;
//Represents permanent employees with bonus
public class PermanentEmployee 
	extends Employee {

		 private double bonus;

		 public PermanentEmployee(String empId, String empName,
		                          double baseSalary, double bonus) {
		     super(empId, empName, baseSalary);
		     this.bonus = bonus;
		 }

		 // Salary = Base Salary + Bonus
		 @Override
		 public double calculateSalary() {
		     return baseSalary + bonus;

}
}
