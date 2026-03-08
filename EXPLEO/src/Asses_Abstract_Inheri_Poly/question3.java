package Asses_Abstract_Inheri_Poly;


/**
 * Abstract class representing a Shape.
 */
abstract class Shapes6 {

    protected String color = "red";
    protected boolean filled = true;

    public Shapes6() {
    }

    public Shapes6(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}

/**
 * Circle class extending Shape.
 */
class Circle extends Shapes6 {

    protected double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}

/**
 * Rectangle class extending Shape.
 */
class Rectangles5 extends Shapes6 {

    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangles5() {
    }

    public Rectangles5(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangles5(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() +
                ", width=" + width +
                ", length=" + length + "]";
    }
}

/**
 * Square class extending Rectangle.
 */
class Square extends Rectangles5 {

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}

/**
 * Test class to run the program.
 */
public class question3 {

    public static void main(String[] args) {

        Circle c = new Circle(5, "blue", true);
        System.out.println(c);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());

        System.out.println();

        Rectangles5 r = new Rectangles5(4, 6, "green", false);
        System.out.println(r);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());

        System.out.println();

        Square s = new Square(4, "yellow", true);
        System.out.println(s);
        System.out.println("Area: " + s.getArea());
        System.out.println("Perimeter: " + s.getPerimeter());
    }
}

