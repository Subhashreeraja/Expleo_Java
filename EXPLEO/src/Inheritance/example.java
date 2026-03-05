package Inheritance;

class leader {
	String tl="Subhashree";
	int empid=63;
}
	class programmer extends leader{
		String progName;
		int empid;
		void setData(String name,int id) {
			progName=name;
			empid=id;
		}
		void displayData() {
			System.out.println("Programmer Name: "+progName);
			System.out.println("Programmer Name: "+empid);
			System.out.println("Programmer Name: "+super.tl);
			System.out.println("Programmer Name: "+super.empid);
			
			}
	}
public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		programmer p=new programmer();
		p.setData("Mathew", 100);
		p.displayData();

	}

}
