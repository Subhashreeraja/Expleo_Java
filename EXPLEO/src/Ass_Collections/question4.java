package Ass_Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class question4 {

    // Function to push students with marks > 75
    public static Stack<String> pushToStack(HashMap<String, Integer> map) {
        Stack<String> stack = new Stack<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 75) {
                stack.push(entry.getKey());
            }
        }

        return stack;
    }

    // Function to pop and display
    public static void popAndDisplay(Stack<String> stack) {
        System.out.println("\nStudents with marks above 75:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();

        students.put("Mano", 85);
        students.put("Shan", 85);
        students.put("John", 55);
        students.put("Anu", 60);
        students.put("Aju", 90);
        students.put("Frank", 80);

        System.out.println("Student Marks in the HashMap: " + students);

        Stack<String> stack = pushToStack(students);
        popAndDisplay(stack);
    }
}

