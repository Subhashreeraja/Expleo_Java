package Oops;

public class AccessingClassMembers {
	int empId;
	String empName;
	void setEmployee(int empId,String empName) {
		this.empId=empId;
		this.empName=empName;
		
	}
	void getEmployee() {
		System.out.println(" Employee Id: "+empId);
		System.out.println(" Employee Name: "+empName);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessingClassMembers emp1=new AccessingClassMembers();
		emp1.setEmployee(1, "Subha");
		emp1.getEmployee();
		
		AccessingClassMembers emp2=new AccessingClassMembers();
		emp2.setEmployee(2, "Shree");
		emp2.getEmployee();

	}

}
