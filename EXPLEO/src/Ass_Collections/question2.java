package Ass_Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class question2 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        s.add("Java");
        s.add("Hello");
        s.add("Programming");
        s.add("World");

        Iterator<String> it = s.iterator();
        String result = "";

        while (it.hasNext()) {
            String element = it.next();
            System.out.println("Elements in the Set : " + element);
            result += element + " ";
        }

        System.out.println("Concatenated result: " + result.trim());
    }
}

