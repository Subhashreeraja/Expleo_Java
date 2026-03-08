package Inheritance;

interface Shape{
	double DEFAULT_VALUE=1.0;
	double calculateArea();
	double calculatePerimeter();
	default String getDescription() {
		return "A shape with unspecified dimensions";
	}
}

abstract class Circle2 implements Shape{
	private double radius;
	public Circle2(double radius) {
		this.radius=radius;
	}
	public Circle2() {
		this.radius=DEFAULT_VALUE;
	}
	
	public double calculatePerimeter() {
		return 2*Math.PI*radius;
	}
	public String getDescription() {
		return "A circle with radius"+radius;
	}
}
   


class Rectangle2 implements Shape{
	private double length;
	private double breadth;
	public Rectangle2(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public Rectangle2() {
		this.length=DEFAULT_VALUE;
		this.breadth=DEFAULT_VALUE;
	}
	
	public double calculateArea() {
		return length*breadth;
	}
	
	public double calculatePerimeter() {
		return 2*(length+breadth);
	}
	
	public String getDescription() {
		return "A Rectangle with length"+length+ "and breadth "+breadth;
	}
	
}

public class interfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 c=new Circle2(5);
		

	}

}
