package Assess_Exception_handling;


	import java.util.Scanner;

	// User defined exception for invalid username
	class InvalidUsernameException extends Exception {
	    InvalidUsernameException(String msg) {
	        super(msg);
	    }
	}

	// User defined exception for invalid password
	class InvalidPasswordException extends Exception {
	    InvalidPasswordException(String msg) {
	        super(msg);
	    }
	}

	public class ques2 {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Stored username and password
	        String storedUsername = "User_123";
	        String storedPassword = "Pass@123";

	        System.out.print("Enter Username: ");
	        String username = sc.nextLine();

	        System.out.print("Enter Password: ");
	        String password = sc.nextLine();

	        try {

	            // -------- Username Validation --------

	            // a) Length check
	            if (username.length() < 6 || username.length() > 30) {
	                throw new InvalidUsernameException("Invalid Username Length");
	            }

	            // b) Only alphanumeric and underscore
	            if (!username.matches("[a-zA-Z][a-zA-Z0-9_]*")) {
	                throw new InvalidUsernameException("Username must start with alphabet and contain only letters, digits, or _");
	            }

	            // -------- Password Validation --------

	            // length check
	            if (password.length() < 8) {
	                throw new InvalidPasswordException("Password must contain at least 8 characters");
	            }

	            // lowercase check
	            if (!password.matches(".*[a-z].*")) {
	                throw new InvalidPasswordException("Password must contain a lowercase letter");
	            }

	            // uppercase check
	            if (!password.matches(".*[A-Z].*")) {
	                throw new InvalidPasswordException("Password must contain an uppercase letter");
	            }

	            // digit check
	            if (!password.matches(".*[0-9].*")) {
	                throw new InvalidPasswordException("Password must contain a digit");
	            }

	            // special character check
	            if (!password.matches(".*[!@#$%^&*()\\-+].*")) {
	                throw new InvalidPasswordException("Password must contain a special character");
	            }

	            // -------- Check with stored values --------

	            if (username.equals(storedUsername) && password.equals(storedPassword)) {
	                System.out.println("Welcome " + username);
	            } else {
	                System.out.println("Invalid username or password");
	            }

	        } catch (InvalidUsernameException e) {
	            System.out.println(e.getMessage());
	        } catch (InvalidPasswordException e) {
	            System.out.println(e.getMessage());
	        }

	        sc.close();
	    }
	}



