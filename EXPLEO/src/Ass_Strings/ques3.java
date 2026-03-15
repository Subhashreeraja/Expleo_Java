package Ass_Strings;
import java.util.regex.Pattern;
public class ques3 {
	

	

	    public static void main(String[] args) {

	        /*
	         * Regex pattern for validating corporate emails
	         */
	        String emailRegex =
	                "^[A-Za-z](?:[A-Za-z0-9]|[._-](?=[A-Za-z0-9]))*@[A-Za-z0-9]+(?:-[A-Za-z0-9]+)*(?:\\.[A-Za-z0-9]+(?:-[A-Za-z0-9]+)*)+$";

	        String email1 = "name.surname@techm.com";
	        String email2 = "firstname_lastname@infosys.co.in";
	        String email3 = "123name@company.com";

	        /*
	         * Validate emails
	         */
	        System.out.println(Pattern.matches(emailRegex, email1));
	        System.out.println(Pattern.matches(emailRegex, email2));
	        System.out.println(Pattern.matches(emailRegex, email3));
	    }
	}
	


