package Asses_Abstract_Inheri_Poly;

/**
 * Demonstrates the use of Interface, Composition, and Polymorphism.
 * Interface: Movable
 * Classes: MovablePoint, MovableCircle
 */

interface Movable {

    void moveUp();

    void moveDown();

    void moveLeft();

    void moveRight();
}


/**
 * Class representing a movable point.
 */
class MovablePoint implements Movable {

    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    /**
     * Constructor to initialize point position and speed
     */
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "), speed=(" + xSpeed + "," + ySpeed + ")";
    }
}


/**
 * Class representing a movable circle.
 * Uses composition (MovablePoint as center).
 */
class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    /**
     * Constructor to initialize circle
     */
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return center.toString() + ", radius=" + radius;
    }
}


/**
 * Main class to test MovablePoint and MovableCircle
 */
public class question2 {

    public static void main(String[] args) {

        // Testing MovablePoint
        MovablePoint point = new MovablePoint(2, 3, 1, 1);
        System.out.println("Point: " + point);

        point.moveUp();
        point.moveRight();
        System.out.println("After moving point: " + point);

        // Testing MovableCircle
        MovableCircle circle = new MovableCircle(5, 5, 2, 2, 10);
        System.out.println("\nCircle: " + circle);

        circle.moveLeft();
        circle.moveDown();
        System.out.println("After moving circle: " + circle);
    }
}



