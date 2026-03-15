package Assess_FileHandling;
import java.io.File;
public class Level1_ques3 {
	

	
	    public static void main(String[] args) {

	        /* Create a File object with the given pathname */
	        File file = new File("C:\\Users\\Subha Shree\\Test folder");

	        /* Check if the file or directory exists */
	        if (file.exists()) {

	            /* Check whether it is a file */
	            if (file.isFile()) {
	                System.out.println("It is a file and it exists.");
	            }

	            /* Check whether it is a directory */
	            else if (file.isDirectory()) {
	                System.out.println("It is a directory and it exists.");
	            }

	        } else {
	            /* If the file or directory does not exist */
	            System.out.println("File or directory does not exist.");
	        }
	    }
	}


