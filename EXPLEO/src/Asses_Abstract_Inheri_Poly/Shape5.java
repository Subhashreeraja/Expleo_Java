package Asses_Abstract_Inheri_Poly;



	/**
	 * Abstract class representing a Shape.
	 */
	public abstract class Shape5 {

	    protected String shapeName;

	    /**
	     * Constructor
	     */
	    public Shape5(String shapeName) {
	        this.shapeName = shapeName;
	    }

	    /**
	     * Abstract method to calculate area.
	     */
	    public abstract double area();

	    /**
	     * Returns the shape name.
	     */
	    public String toString() {
	        return shapeName;
	    }
	}


