package Asses_Abstract_Inheri_Poly;

/**
 * Represents a Rectangle.
 */
public class Rectangle5 extends Shape5 {

	private double length;
	private double width;

	public Rectangle5(double length, double width) {
		super("Rectangle");
		this.length = length;
		this.width = width;
	}

	public double area() {
		return length * width;
	}

	public String toString() {
		return super.toString() + " of length " + length + " and width " + width;
	}

}
