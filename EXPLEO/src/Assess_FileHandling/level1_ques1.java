package Assess_FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class level1_ques1 {
	
	

		    public static void main(String[] args) {

		        /* Variable to store the current word */
		        String word;

		        /* Variable to store the longest word */
		        String longestWord = "";

		        try {
		            /* Open the file using FileReader */
		            FileReader fr = new FileReader("src/Assess_FileHandling/q1.txt");

		            /* Use BufferedReader to read file */
		            BufferedReader br = new BufferedReader(fr);

		            /* Read file line by line */
		            while ((word = br.readLine()) != null) {

		                /* Split line into words */
		                String[] words = word.split(" ");

		                /* Check each word */
		                for (String w : words) {

		                    /* Compare length of words */
		                    if (w.length() > longestWord.length()) {
		                        longestWord = w;
		                    }
		                }
		            }

		            /* Close the reader */
		            br.close();

		            /* Print the longest word */
		            System.out.println("Longest word: " + longestWord);

		        } catch (IOException e) {

		            /* Handle exception */
		            System.out.println("Error reading file");
		        }
		    }
		

	


}
