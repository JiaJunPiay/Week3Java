import java.util.Scanner;

interface Calculator{
	public static final int count = 3; //Cannot modify by other classes because declared as final
	
	void add(); //Interface method are automatically created as public and abstract
	void sub();
}

interface Calculator2 {
	void mul();
	void div();
}

interface MyCalc{
	//class will be treated as default, while method is treated as public in an interface
	
	default void display() {
		System.out.println("Display method");
	}
	
	static void fun() {
		System.out.println("Fun method");
	}
	
	void add();
	void sub();
}

/*
//Unexpected token error
interface Calculator3 implements Calculator{
	void mul();
	void div();
}
*/

interface Calculator3 extends Calculator{
	void mul();
	void div();
}

class MyCalculator implements Calculator, Calculator2{

	@Override
	public void add() { //Method are treated as default, which is a lower visibility then public, hence public is needed
		int a = 30;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		
		System.out.println("Count = " + count);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int a = 30;
		int b = 20;
		int c = a - b;
		System.out.println(c);
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int a = 30;
		int b = 20;
		int c = a * b;
		System.out.println(c);
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		float a = 30f;
		float b = 20f;
		float c = a / b;
		System.out.println(c);
	}
	
}

abstract class InputCalculator implements Calculator, Calculator2{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number to add : ");
		int a = scan.nextInt();
		System.out.print("Enter second number to add : ");
		int b = scan.nextInt();
		int c = a + b;
		System.out.println("The sum is " + c);
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number to subtract : ");
		int a = scan.nextInt();
		System.out.print("Enter second number to subtract : ");
		int b = scan.nextInt();
		int c = a - b;
		System.out.println("The subtraction is " + c);
		
	}
}

//Inheriting a abstract class that has implemented an interface class
class InputMoreCalculator extends InputCalculator{
	@Override
	public void mul() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number to mutiply : ");
		int a = scan.nextInt();
		System.out.print("Enter second number to mutiply : ");
		int b = scan.nextInt();
		int c = a * b;
		System.out.println("The multiplication is " + c);
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number to divide : ");
		float a = scan.nextFloat();
		System.out.print("Enter second number to divide : ");
		float b = scan.nextFloat();
		float c = a / b;
		System.out.println("The division is " + c);
	}
}

class CalculatorInput implements Calculator3{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number to add : ");
		int a = scan.nextInt();
		System.out.print("Enter second number to add : ");
		int b = scan.nextInt();
		int c = a + b;
		System.out.println("The sum is " + c);
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number to subtract : ");
		int a = scan.nextInt();
		System.out.print("Enter second number to subtract : ");
		int b = scan.nextInt();
		int c = a - b;
		System.out.println("The subtraction is " + c);
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number to mutiply : ");
		int a = scan.nextInt();
		System.out.print("Enter second number to mutiply : ");
		int b = scan.nextInt();
		int c = a * b;
		System.out.println("The multiplication is " + c);
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number to divide : ");
		float a = scan.nextFloat();
		System.out.print("Enter second number to divide : ");
		float b = scan.nextFloat();
		float c = a / b;
		System.out.println("The division is " + c);
	}
	
}

class Calculation{
	void doCal(Calculator3 c) {//Interface type reference
		c.add();
		c.sub();
		c.mul();
		c.div();
	}
	
	void doCal(InputCalculator c) {//Interface type reference
		c.add();
		c.sub();
		c.mul();
		c.div();
	}
	
	void doCal(MyCalculator c) {//Interface type reference
		c.add();
		c.sub();
		c.mul();
		c.div();
	}
}

class Calculation1{
	public void mul() {
		// TODO Auto-generated method stub
		int a = 30;
		int b = 20;
		int c = a * b;
		System.out.println(c);
	}

	public void div() {
		// TODO Auto-generated method stub
		float a = 30f;
		float b = 20f;
		float c = a / b;
		System.out.println(c);
	}
}

//Extends class with Interface class
class MyCalculation extends Calculation1 implements Calculator{

	@Override
	public void add() { //Method are treated as default, which is a lower visibility then public, hence public is needed
		int a = 30;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int a = 30;
		int b = 20;
		int c = a - b;
		System.out.println(c);
	}
	
}

class ThisCalc implements MyCalc{

	@Override
	public void add() { //Method are treated as default, which is a lower visibility then public, hence public is needed
		int a = 30;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int a = 30;
		int b = 20;
		int c = a - b;
		System.out.println(c);
	}
	
}

public class InterfaceMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Implemented 2 interface classes
		MyCalculator mc = new MyCalculator();
		
		//Abstract class that implemented an with 2 interface class
		InputCalculator ic = new InputMoreCalculator();
		
		//Only implemented Calculator3
		CalculatorInput ci = new CalculatorInput();
		
		Calculation c = new Calculation();
		
		ThisCalc tc = new ThisCalc();
		tc.display();
		MyCalc.fun();
		
		
		System.out.println((mc.count + 4));
		
		c.doCal(mc);
		c.doCal(ic);
		//c.doCal(ci);
		
		
		

		
	}

}
