package Asses_Abstract_Inheri_Poly;

/**
 * Main class to test paint calculations.
 */

public class question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paint paint = new Paint(350);

		// Create shapes
		Rectangle5 deck = new Rectangle5(20, 35);
		Sphere bigBall = new Sphere(15);
		Cylinder tank = new Cylinder(10, 30);

		// Calculate paint amounts
		double deckAmt = paint.amount(deck);
		double ballAmt = paint.amount(bigBall);
		double tankAmt = paint.amount(tank);

		System.out.println("Paint needed for deck: " + deckAmt);
		System.out.println("Paint needed for big ball: " + ballAmt);
		System.out.println("Paint needed for tank: " + tankAmt);

	}

}
