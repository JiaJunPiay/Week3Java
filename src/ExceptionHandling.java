import java.util.InputMismatchException;
import java.util.Scanner;

class Launch{
	//Allow the other method to know that there is an exception in this method
	void fun() throws ArithmeticException{
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("Enter a number 1 : ");
			int a = scan.nextInt();
			System.out.print("Enter a number 2 : ");
			int b = scan.nextInt();
			int c = a/b;
			System.out.println("Answer is : " + c);
		}
		catch(ArithmeticException e) {
			//Able to allow the program to continue running even if there is an exception in the program (Eg User mistake)
			System.out.println("Error with the calculation! :(");
			throw e;
		}
		finally {
			System.out.println("Program is done!");
		}
		//Anything below here not in finally method will not run if an exception is thrown
		System.out.println("Program is here!");
	}
}

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello! This program is used to divide 2 numbers");
		
		/*
		Scanner scan = new Scanner(System.in);
		//ArithmeticException - occurs when an attempt is made to divide two numbers and the number in the denominator is zero
		try {
			System.out.print("Enter a number 1 : ");
			int a = scan.nextInt();
			System.out.print("Enter a number 2 : ");
			int b = scan.nextInt();
			int c = a/b;
			System.out.println("Answer is : " + c);
		}
		catch(ArithmeticException e) {
			//Able to allow the program to continue running even if there is an exception in the program (Eg User mistake)
			System.out.println("Error with the calculation! :(");
		}
		*/
		
		/*
		//Multiple catch in 1 try
		try {
			System.out.print("Enter array size : ");
			int size = scan.nextInt();
			int arr[] = new int[size];
			System.out.print("Enter index data to be inserted into : ");
			int index = scan.nextInt();
			System.out.print("Enter data to be inserted into : ");
			int data = scan.nextInt();
			
			arr[index] = data;
			System.out.println(arr[index] + " has been inserted!");
			
		}
		catch(ArithmeticException e) {
			System.out.println("Enter a non-zero number :(");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("Array cannot be negative! >:(");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The index array doesn't exist :(");
		}
		catch(InputMismatchException e) {
			//indicating that the retrieved token does not match the pattern for the expected type or that the token is out of range for the expected type. (Eg. Int expected but got String input)
			System.out.println("Integer element! :(");
		}
		catch(Exception e) {
			//Catch any other exception that doesn't fall under the top exception
			System.out.println("Error! :(");
			//printStackTrace -> prints the throwable along with other details like the line number and class name where the exception occurred.
			e.printStackTrace();
		}
		finally {
			
		}
		*/
		
		Launch l = new Launch();
		try {
			l.fun();
		}
		catch(Exception e) {
			System.out.println("Main here!");
		}
		System.out.println("Connnection here!");
		
	}

}
