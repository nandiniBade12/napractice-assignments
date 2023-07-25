package itransform.oopsconcept;

abstract class Shape{
	public abstract void draw();
	
}

class Line extends Shape{
	
	public void draw() {
		System.out.println("Drawing a line");
	}
}

class Rectangle extends Shape{
	
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
}

class Circle extends Shape{
	
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}

public class AbstractExample {

	public static void main(String[] args) {
		Shape shape1 = new Line();
		Shape shape2 = new Rectangle();
		Shape shape3 = new Circle();
		
		shape1.draw();
		shape2.draw();
		shape3.draw();
	}

}
