package Ass_Strings;

import java.util.Scanner;

public class ques2 {


	    public static void main(String[] args) {

	        /*
	         * Input string with leading and trailing spaces
	         */
	        String input = " Welcome to Java ";

	        int start = 0;
	        int end = input.length() - 1;

	        /*
	         * Find first non-space character
	         */
	        while (start <= end && input.charAt(start) == ' ') {
	            start++;
	        }

	        /*
	         * Find last non-space character
	         */
	        while (end >= start && input.charAt(end) == ' ') {
	            end--;
	        }

	        String result = "";

	        /*
	         * Copy characters between start and end
	         */
	        for (int i = start; i <= end; i++) {
	            result += input.charAt(i);
	        }

	        /*
	         * Display result
	         */
	        System.out.println("\"" + result + "\"");
	    }
	}
	


