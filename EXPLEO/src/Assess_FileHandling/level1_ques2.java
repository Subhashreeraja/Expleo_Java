package Assess_FileHandling;
import java.io.File;

public class level1_ques2 {

    public static void main(String[] args) {

        /* Specify folder path */
        File folder = new File("C:\\Users\\Subha Shree\\Test folder");

        /* Get list of files */
        File files[] = folder.listFiles();

        if (files != null) {

            for (File file : files) {

                /* Convert name to lowercase and check extension */
                if (file.getName().toLowerCase().endsWith(".txt")) {

                    /* Print txt files */
                    System.out.println(file.getName());
                }
            }

        } else {
            System.out.println("Folder not found");
        }
    }
}