package Ass_Strings;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ques5 {
	
	    public static void main(String[] args) {

	        /*
	         * Raw log entry containing sensitive data
	         */
	        String log = "User=Richard; Password=ricadmin@123; IP=192.168.1.1; Status=SUCCESS";

	        /*
	         * Regex to detect password field
	         */
	        Pattern passwordPattern = Pattern.compile("(Password=)([^;]+)");
	        Matcher passwordMatcher = passwordPattern.matcher(log);

	        /*
	         * Mask password value
	         */
	        log = passwordMatcher.replaceAll("$1************");

	        /*
	         * Regex to detect IPv4 address
	         */
	        Pattern ipPattern = Pattern.compile("\\b(\\d{1,3}\\.){3}\\d{1,3}\\b");
	        Matcher ipMatcher = ipPattern.matcher(log);

	        /*
	         * Replace IP address with redacted format
	         */
	        log = ipMatcher.replaceAll("xxx.xxx.xxx.xxx");

	        /*
	         * Print sanitized log
	         */
	        System.out.println(log);
	    }
	}


