package Assess_FileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Level1_ques5 {
	

	
	    public static void main(String[] args) {

	        /* Declare variable to store each line */
	        String line;

	        try {

	            /* Create FileReader object */
	            FileReader fr = new FileReader("src/Assess_FileHandling/q5.txt");

	            /* Wrap FileReader with BufferedReader for efficient reading */
	            BufferedReader br = new BufferedReader(fr);

	            /* Read file line by line */
	            while((line = br.readLine()) != null) {

	                /* Store and print the line */
	                System.out.println(line);

	            }

	            /* Close the BufferedReader */
	            br.close();

	        } catch(IOException e) {

	            /* Handle exception if error occurs */
	            System.out.println("Error reading file.");

	        }
	    }
	}


