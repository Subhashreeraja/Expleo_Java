package Ass_Inheri_Poly;
//Represents intern employees with fixed stipend
public class Intern extends Employee {

private double stipend;

public Intern(String empId, String empName, double stipend) {
   super(empId, empName, 0.0);
   this.stipend = stipend;
}

// Salary = Fixed stipend
@Override
public double calculateSalary() {
   return stipend;
}
}
