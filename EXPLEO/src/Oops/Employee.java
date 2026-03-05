package Oops;

public class Employee {
	int empid;
	String empName;
	double empSalary;
	Employee(int empid,String empName,double empSalary){
		this.empid=empid;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	Employee(){
		this(101,"Subha",50000);
		System.out.println("Employee created Successfully");
		}
	void registerEmployee() {
		System.out.println("Registering Employee");
		this.displayDetails();
	}
	void displayDetails() {
		System.out.println("Employee ID:"+empid);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee Salary:"+empSalary);
	}
	//4.use 'this' to pass current obj as an argument
	void sendForProcessing() {
		HRDepartment hr=new HRDepartment();
		hr.processEmployee(this);//pass current obj
	}
	//5.using'this' to return current Object(Method Chaining)
	Employee updateSalary(double hikePercentage) {
		this.empSalary=empSalary+(empSalary*hikePercentage/100);
		return this;
	}
	Employee updatename(String newName) {
		this.empName=newName;
		return this;
	}
	class HRDepartment{
		void processEmployee(Employee e) {
			System.out.println("HR Department Processing Employee..");
			System.out.println("Processed Employee: "+e.empName+"with salary"+e.empSalary);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee();
		obj.displayDetails();
		

	}

}
