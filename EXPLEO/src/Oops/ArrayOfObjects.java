package Oops;

public class ArrayOfObjects {
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
		ArrayOfObjects emp[]=new ArrayOfObjects[2];
		for(int i=0;i<2;i++) {
			emp[i]=new ArrayOfObjects();
		}
		emp[0].setEmployee(1,"Subha");
		emp[1].setEmployee(2,"Shree");
		for(int i=0;i<emp.length;i++) {
			emp[i].getEmployee();
		}

	}

}
