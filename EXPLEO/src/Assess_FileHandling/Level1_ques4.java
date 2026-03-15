package Assess_FileHandling;
import java.io.File;
import java.util.Date;

public class Level1_ques4 {
    public static void main(String[] args) {

        /* Create a File object */
        File file = new File("C:\\Users\\Subha Shree\\Test Folder");

        /* Check if file exists */
        if(file.exists()) {

            /* Get the last modified time in milliseconds */
            long time = file.lastModified();

            /* Convert milliseconds into readable date */
            Date date = new Date(time);

            /* Print the last modified date and time */
            System.out.println("Last Modified Time: " + date);

        } else {

            /* Print message if file does not exist */
            System.out.println("File does not exist.");

        }
    }
}



