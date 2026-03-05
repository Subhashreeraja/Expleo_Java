package Oops;

public class theatreConstructor {
	int theatreid;
	String theatrename;
	String theatrelocation;
	theatreConstructor(int id,String name,String location) {
		 theatreid=id;
		 theatrename=name;
		theatrelocation=location;
	}
	public void displayTheatre() {
		System.out.println("Theatre ID: "+theatreid);
		System.out.println("Theatre Name: "+theatrename);
		System.out.println("Theatre Location: "+theatrelocation);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	theatreConstructor T1=new theatreConstructor(1,"Inox","Salem");
		T1.displayTheatre();//garbage collector system gc,finalize()
		
		
		

	}

}
