package Training;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Readinput_for_movie {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a MovieId: ");
		int movieid=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter a Movie Name: ");
		String moviename=sc.nextLine();
		
		System.out.println("Enter a Movie Description: ");
		String movieDescription=sc.nextLine();
		
		System.out.println("Enter a Movie Language: ");
		String movieLanguage=sc.nextLine();
		
		System.out.println("Enter a Movie Genre: ");
		String movieGenre=sc.nextLine();
		
		System.out.println("Enter a Movie Release date(dd/MM/yyyy): ");
		String date=sc.next();
		 SimpleDateFormat movieReleaseDate= new SimpleDateFormat("dd/MM/yyyy");
		 Date moviedate=movieReleaseDate.parse(date);
		 
		 System.out.println("Enter a Movie Seat Cost: ");
		 float seatCost=sc.nextFloat();
		 
		System.out.println("ENTERED MOVIE DETAILS ARE");
		System.out.println("MovieId: "+movieid);
        System.out.println("Movie Name: "+moviename);
		System.out.println("Movie Description: "+ movieDescription);
		System.out.println("Movie Language: "+movieLanguage);
		System.out.println("Movie Genre: "+movieGenre);
		System.out.println("Movie Release date(dd/MM/yyyy): "+moviedate);
		System.out.println("Movie Seat Cost: "+seatCost);

	}

}
