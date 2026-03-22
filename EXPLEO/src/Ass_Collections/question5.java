package Ass_Collections;
import java.util.*;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numbers = new TreeSet<>();

        while (true) {
            System.out.print("Enter a number (or type 'done'): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            numbers.add(Integer.parseInt(input));
        }

        System.out.println("\nSorted unique numbers: " + numbers);

        // Convert to list for calculations
        List<Integer> list = new ArrayList<>(numbers);

        // Average
        double sum = 0;
        for (int num : list) {
            sum += num;
        }
        double avg = sum / list.size();

        // Min & Max
        int min = Collections.min(list);
        int max = Collections.max(list);

        // Odd numbers
        List<Integer> oddNumbers = new ArrayList<>();
        for (int num : list) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }

        System.out.println("Average: " + avg);
        System.out.println("Lowest: " + min);
        System.out.println("Highest: " + max);
        System.out.println("Odd numbers: " + oddNumbers);

        sc.close();
    }
}




