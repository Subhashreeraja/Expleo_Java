package Inheritance;


abstract class Shapes{
	void draw() {
		System.out.println("Drawing..");
		}
	abstract void area();
	abstract void perimeter();
}

 class Rectangle1 extends Shapes{
	 int length,breadth;
	 Rectangle1(int length,int breadth){
		 this.length=length;
		 this.breadth=breadth;
	 }
	 void area() {
		 int area=length*breadth;
		 System.out.println("Area of Rectangle: "+area);
	 }
	 void perimeter() {
		 int perimeter=2*(length+breadth);
		 System.out.println("Perimeter of Rectangle: "+perimeter);
		 
	 }
 }
 
 class Square1 extends Shapes{
	 int side;
	 Square1(int side){
		 this.side=side;
		 
	 }
	 void area() {
		 int area=side*side;
		 System.out.println("Area of Square "+area);
	 }
	 void perimeter() {
		 int perimeter=4*side;
		 System.out.println("Perimeter of Square "+perimeter);
		 
	 }
 }

 class Circle1 extends Shapes{
	 double radius;
	 Circle1(double radius){
		 this.radius=radius;
		 
	 }
	 void area() {
		 double area=3.14*radius*radius;
		 System.out.println("Area of Circle "+area);
	 }
	 void perimeter() {
		 double perimeter=2*3.14*radius;
		 System.out.println("Perimeter of Circle "+perimeter);
		 
	 }
 }
public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes s;
		s=new Rectangle1(3,5);
		s.area();
		s.perimeter();
		s=new Square1(4);
		s.area();
		s.perimeter();
		s=new Circle1(6.5);
		s.area();
		s.perimeter();

	}

}
