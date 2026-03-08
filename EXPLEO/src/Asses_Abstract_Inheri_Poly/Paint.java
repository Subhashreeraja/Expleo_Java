package Asses_Abstract_Inheri_Poly;


/**
 * Represents Paint with coverage.
 */
public class Paint {

    private double coverage; // square feet per gallon

    public Paint(double coverage) {
        this.coverage = coverage;
    }

    /**
     * Calculates paint amount needed.
     */
    public double amount(Shape5 s) {

        System.out.println("Computing amount for " + s);

        return s.area() / coverage;
    }

	
}
