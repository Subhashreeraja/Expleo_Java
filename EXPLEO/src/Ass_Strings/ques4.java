package Ass_Strings;

public class ques4 {


	    public static void main(String[] args) {

	        /*
	         * Input message to encrypt
	         */
	        String message = "Hello World 123";

	        String encrypted = "";

	        for (int i = 0; i < message.length(); i++) {

	            char ch = message.charAt(i);

	            /*
	             * If uppercase letter
	             */
	            if (Character.isUpperCase(ch)) {

	                ch = (char) ('A' + (ch - 'A' + 3) % 26);
	                encrypted += ch;
	            }

	            /*
	             * If lowercase letter
	             */
	            else if (Character.isLowerCase(ch)) {

	                ch = (char) ('a' + (ch - 'a' + 3) % 26);
	                encrypted += ch;
	            }

	            /*
	             * If digit keep same
	             */
	            else if (Character.isDigit(ch)) {

	                encrypted += ch;
	            }

	            /*
	             * Replace space with underscore
	             */
	            else if (ch == ' ') {

	                encrypted += '_';
	            }

	            /*
	             * Other characters remain unchanged
	             */
	            else {

	                encrypted += ch;
	            }
	        }

	        /*
	         * Print encrypted message
	         */
	        System.out.println(encrypted);
	    }
	}


