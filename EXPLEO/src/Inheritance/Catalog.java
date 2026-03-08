package Inheritance;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

interface SearchbyGenre {
	public abstract void searchbyGenre(String genre);
}

interface SearchbyTitle {
	public abstract void searchbyTitle(String title);
}

class Movie {
	private String title;

	private String genre;

	private int rating;

	private String language;

	private Date releaseDate;

	private String country;

	private String category;

	Movie(String title, String genre, int rating, String language,

			Date releaseDate, String country, String category) {

		this.title = title;

		this.genre = genre;

		this.rating = rating;

		this.language = language;

		this.releaseDate = releaseDate;

		this.country = country;

		this.category = category;

	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	public String getGenre() {
		// TODO Auto-generated method stub
		return genre;
	}

	public void getMovieDetail() {

		System.out.println("Title: " + title);

		System.out.println("Genre: " + genre);

		System.out.println("Rating: " + rating);

		System.out.println("Language: " + language);

		System.out.println("Release Date: " + releaseDate);

		System.out.println("Country: " + country);

		System.out.println("Category: " + category);

		System.out.println("-----------------------------");

	}

}

public class Catalog implements SearchbyGenre, SearchbyTitle {

	private static Date lastUpdated;
	private static List<Movie> MovieList = new ArrayList<Movie>();

	public void searchbyTitle(String title) {
		for (Movie movie : MovieList) {
			if (movie.getTitle().equals(title)) {
				movie.getMovieDetail();
			}
		}
	}

	public void searchbyGenre(String genre) {
		for (Movie movie : MovieList) {
			if (movie.getGenre().equalsIgnoreCase(genre)) {
				movie.getMovieDetail();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Catalog c = new Catalog();
		Calendar cal = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = cal.getTime();
		String todaysdate = dateFormat.format(date);
		Movie M1 = new Movie("AAA", "Drama", 3, "English", date, "France", "Action");
		MovieList.add(M1);

		c.searchbyTitle("AAA");

		c.searchbyGenre("Drama");
	}

}
