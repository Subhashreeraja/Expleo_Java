package Ass_Strings;

import java.util.Scanner;

public class ques1 {

    public static void main(String[] args) {

        /*
         * Create Scanner object to read input from user
         */
        Scanner sc = new Scanner(System.in);

        /*
         * Read the input string
         */
        String input = sc.nextLine();

        /*
         * Outer loop: iterate through each character of the string
         */
        for (int i = 0; i < input.length(); i++) {

            /*
             * Flag variable to check whether the character already appeared
             * before the current index
             * 0 -> character not found before
             * 1 -> duplicate character
             */
            int count = 0;

            /*
             * Inner loop: compare current character with all previous characters
             */
            for (int j = 0; j < i; j++) {

                /*
                 * If duplicate character found
                 */
                if (input.charAt(i) == input.charAt(j)) {
                    count = 1;
                    break;
                }
            }

            /*
             * If character appeared for the first time, print it
             */
            if (count == 0) {
                System.out.print(" " + input.charAt(i));
            }
        }

        /*
         * Close scanner to prevent resource leak
         */
        sc.close();
    }
}