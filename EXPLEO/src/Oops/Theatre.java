package Oops;



public class Theatre {
	int theatreid=4523;
	String theatreName="INOX";
	String theatreLocation="Salem";

public void displayTheatre() {
	System.out.println("Theatre ID:"+theatreid);
	System.out.println("Theatre Name:"+theatreName);
	System.out.println("Theatre location:"+theatreLocation);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre obj=new Theatre();
		obj.displayTheatre();

	}

}
