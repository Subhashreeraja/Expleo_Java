package Ass_Inheri_Poly;

public  class Employee {
	//  base class representing an employee


	    // Protected data members
	    protected String empId;
	    protected String empName;
	    protected double baseSalary;

	    // Parameterized constructor
	    public Employee(String empId, String empName, double baseSalary) {
	        this.empId = empId;
	        this.empName = empName;
	        this.baseSalary = baseSalary;
	    }

	    // Getter methods
	    public String getEmpId() {
	        return empId;
	    }

	    public String getEmpName() {
	        return empName;
	    }

	    public double getBaseSalary() {
	        return baseSalary;
	    }

	    //  method for salary calculation
	    public  double calculateSalary(){
	        return baseSalary;
	    }

	    // Returns formatted employee details
	    @Override
	    public String toString() {
	        return "Employee ID : " + empId +
	               "\nEmployee Name : " + empName +
	               "\nFinal Salary : " + calculateSalary();
	    }
	}


