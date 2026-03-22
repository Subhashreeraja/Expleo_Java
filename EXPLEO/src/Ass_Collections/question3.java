package Ass_Collections;
import java.util.HashMap;

public class question3 {
    public static void main(String[] args) {
        String text = "Write Java code to define yet another Set s. Insert 3 floating point numbers in s, and using an iterator, find the sum of the numbers in s.";

        HashMap<Character, Integer> map = new HashMap<>();
        char[] targetChars = {'a', 'c', 'o', 's'};

        // Initialize counts
        for (char ch : targetChars) {
            map.put(ch, 0);
        }

        // Count characters
        for (char ch : text.toLowerCase().toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }
        }

        // Display result
        System.out.println("Character counts:");
        for (char ch : targetChars) {
            System.out.println(ch + ": " + map.get(ch));
        }
    }
}

