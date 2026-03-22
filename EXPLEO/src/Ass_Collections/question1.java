package Ass_Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.print("How many names do you want to input? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name #" + (i + 1) + ": ");
            String name = sc.nextLine();
            names.add(name);
        }

        System.out.println("\nNames longer than 5 characters:");
        for (String name : names) {
            if (name.length() > 5) {
                System.out.println(name);
            }
        }

        sc.close();
    }
}
