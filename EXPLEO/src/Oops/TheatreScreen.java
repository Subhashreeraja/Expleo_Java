package Oops;

public class TheatreScreen {
	private static int totalseats=20;//static variable
	TheatreScreen(){
		System.out.println("Current Seat Availability:"+totalseats);
	}
	
	public void DisplayTheatreScreen() {
		System.out.println("Current Seat Availability:"+totalseats);
		
	}
	
	public static void BookTicket(int nooftickets) { //static method
		System.out.println("No of Seats Booked: "+nooftickets);
		totalseats-=nooftickets;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheatreScreen TS1=new TheatreScreen();
		TS1.BookTicket(4);
		TheatreScreen TS2=new TheatreScreen();
		TS2.BookTicket(5);
		TS2.DisplayTheatreScreen();

	}

}
