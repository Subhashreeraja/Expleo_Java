package Ass_Array;
import java.util.Random;

public class Level2_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();

		int[] frequency = new int[6]; // index 0 for 1, 1 for 2 ... 5 for 6

		// Roll dice 100 times
		for (int i = 0; i < 100; i++) {
			int roll = rand.nextInt(6) + 1; // generates number 1 to 6
			frequency[roll - 1]++; // increase count
		}

		// Display frequency
		for (int i = 0; i < 6; i++) {
			System.out.println("Number " + (i + 1) + " occurred " + frequency[i] + " times");
		}
	}

}
