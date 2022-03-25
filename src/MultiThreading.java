import java.util.Scanner;

/*
//Multi-threading

class Banking extends Thread{
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Banking started");
		System.out.println("Enter account number : ");
		String an = scan.next();
		System.out.println("Enter password number : ");
		String pw = scan.next();
		System.out.println("You have collected the money!");
		System.out.println("Banking ended");
	}
}

class Print extends Thread{
	public void run() {
		System.out.println("Printing started");
		for(int i=0; i<5; i++) {
			System.out.println("Printing now.........");
			try {
				//Dely action by 2 seconds
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printing ended");
	}
}

class Addition extends Thread{
	public void run() {
		System.out.println("Addition started");
		int a = 5;
		int b = 10;
		for(int i=0; i<5; i++) {
			System.out.println(a + " + " + b + " = " + (a+b));
			a++;
			b++;
			try {
				//Dely action by 1 seconds
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Addition ended");
	}
}

public class MultiThreading {
	public static void main(String args[]) {
		Banking b = new Banking();
		Print p = new Print();
		Addition a = new Addition();
		
		//Start will call the run method, allowing the Thread to do it's scheduling 
		b.start();
		p.start();
		a.start();
	}
}
*/

/*
//Creating multithreading using Runnable
class Banking implements Runnable{
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Banking started");
		System.out.println("Enter account number : ");
		String an = scan.next();
		System.out.println("Enter password number : ");
		String pw = scan.next();
		System.out.println("You have collected the money!");
		System.out.println("Banking ended");
	}
}

class Print implements Runnable{
	public void run() {
		System.out.println("Printing started");
		for(int i=0; i<5; i++) {
			System.out.println("Printing now.........");
			try {
				//Dely action by 2 seconds
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printing ended");
	}
}

class Addition implements Runnable{
	public void run() {
		System.out.println("Addition started");
		int a = 5;
		int b = 10;
		for(int i=0; i<5; i++) {
			System.out.println(a + " + " + b + " = " + (a+b));
			a++;
			b++;
			try {
				//Dely action by 1 seconds
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Addition ended");
	}
}

public class MultiThreading {
	public static void main(String args[]) {
		Banking b = new Banking();
		Print p = new Print();
		Addition a = new Addition();
		
		//Creating new Thread for the runnable
		Thread bankThread = new Thread(b);
		Thread printThread = new Thread(p);
		Thread addThread = new Thread(a);
		//Start will call the run method, allowing the Thread to do it's scheduling 
		bankThread.start();
		printThread.start();
		addThread.start();
	}
}
*/

//Multithreading under 1 class using getName/setName
class Activity extends Thread{
	public void run() {
		if(getName().equals("Bank")){
			banking();
		}
		else if(getName().equals("Print")){
			printing();
		}
		else if(getName().equals("Add")){
			addition();
		}
	}
	
	void banking(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Banking started");
		System.out.println("Enter account number : ");
		String an = scan.next();
		System.out.println("Enter password number : ");
		String pw = scan.next();
		System.out.println("You have collected the money!");
		System.out.println("Banking ended");
	}
	
	void printing() {
		System.out.println("Printing started");
		for(int i=0; i<5; i++) {
			System.out.println("Printing now.........");
			try {
				//Dely action by 2 seconds
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printing ended");
	}
	
	void addition() {
		System.out.println("Addition started");
		int a = 5;
		int b = 10;
		for(int i=0; i<5; i++) {
			System.out.println(a + " + " + b + " = " + (a+b));
			a++;
			b++;
			try {
				//Dely action by 1 seconds
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Addition ended");
	}
}

public class MultiThreading {
	public static void main(String args[]) {
		Activity bankingActivity = new Activity();
		Activity printActivity = new Activity();
		Activity addActivity = new Activity();
		
		bankingActivity.setName("Bank");
		printActivity.setName("Print");
		addActivity.setName("Add");
		
		bankingActivity.start();
		printActivity.start();
		addActivity.start();
	}
}
