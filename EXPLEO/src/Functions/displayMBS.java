package Functions;
import java.util.Scanner;
public class displayMBS {
	
	public static void getMovieDetails(String movieName,String movieDescription,String movieDuration,String movieLanguage,String movieReleaseDate,String  movieCountry,String  movieGenre) {
		
		System.out.println("Movie Name:"+movieName);
		System.out.println("Movie Description:"+movieDescription);
		System.out.println("Movie Duration:"+movieDuration);
		System.out.println("Movie Language:"+movieLanguage);
		System.out.println("Movie ReleaseDate:"+movieReleaseDate);
		System.out.println("Movie Country:"+movieCountry);
		System.out.println("Movie Genre:"+movieGenre);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String movieName=sc.nextLine();
		String movieDescription=sc.nextLine();
		String movieDuration=sc.nextLine();
		String movieLanguage=sc.nextLine();
		String movieReleaseDate=sc.nextLine();
		String movieCountry=sc.nextLine();
		String movieGenre=sc.nextLine();
		getMovieDetails(movieName,movieDescription,movieDuration,movieLanguage,movieReleaseDate, movieCountry,movieGenre);
		
		
		

	}

}
