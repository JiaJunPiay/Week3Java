import java.util.Scanner;

abstract class Shape{
	float area;
	
	abstract void input();
	abstract void compute();
	void display() {
		compute();
		System.out.println("The area is " + area);
	};
}

class Triangle extends Shape{
	private float height;
	private float base;
	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the height of the triangle : ");
		height = scan.nextFloat();
		System.out.print("Enter the base of the triangle : ");
		base = scan.nextFloat();
	}
	
	void compute() {
		area = 0.5f * height * base;
	}
}

class Rectangle extends Shape{
	private float length;
	private float breadth;
	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of the rectangle : ");
		length = scan.nextFloat();
		System.out.print("Enter the breadth of the rectangle : ");
		breadth = scan.nextFloat();
	}
	
	void compute() {
		area = length * breadth;
	}
}

class Circle extends Shape{
	private float radius;
	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius of the circle : ");
		radius = scan.nextFloat();
	}
	
	void compute() {
		area = 3.14f * radius * radius;
	}
}

class Calculate{
	void count(Shape s) {
		s.input();
		s.display();
	}
}

public class CalculateArea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose a shape area to calculate ");
		System.out.println("-------------------------------------");
		System.out.println("1. Triangle");
		System.out.println("2. Rectangle");
		System.out.println("3. Circle");
		System.out.print("Enter your option : ");
		int option = scan.nextInt();
		while(option < 0 || option > 3) {
			System.out.print("Option invalid! Please enter your option again : ");
			option = scan.nextInt();
		}
		
		if(option == 1) {
			Triangle t = new Triangle();
			Calculate cl = new Calculate();
			cl.count(t);
		}
		else if(option == 2) {
			Rectangle r = new Rectangle();
			Calculate cl = new Calculate();
			cl.count(r);
		}
		else if(option == 3) {
			Circle c = new Circle();
			Calculate cl = new Calculate();
			cl.count(c);
		}
		
	}
}
