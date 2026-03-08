package Asses_Abstract_Inheri_Poly;

/**
 * Represents a Sphere.
 */
public class Sphere extends Shape5 {

	private double radius;

	public Sphere(double radius) {
		super("Sphere");
		this.radius = radius;
	}

	public double area() {
		return 4 * Math.PI * radius * radius;
	}

	public String toString() {
		return super.toString() + " of radius " + radius;
	}

}
