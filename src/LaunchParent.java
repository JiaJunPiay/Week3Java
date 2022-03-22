class Parent{
	final String finalString = "This string can't be edited";
	 void eat() {
		System.out.println("Parent is eating");
	}
	 
	 final void finalMethod() {
		 System.out.println("This method can't be edited");
	 }
}

class Child extends Parent{
	final void eat() {
		System.out.println("First Child is eating");
		System.out.println(finalString);
		finalMethod();
	}
	
	void cry() {
		System.out.println("First child is crying");
	}
}

class Kid extends Parent{
	void eat() {
		System.out.println("Kid is eating");
		finalMethod();
	}
	
	void cry() {
		System.out.println("Kid is crying");
	}
}
public class LaunchParent {

	public static void main(String[] args) {
		Child c = new Child();
		Kid k = new Kid();
		Parent p = new Parent();
		
		p = c;
		p.eat();
		((Child)(p)).cry();
		
		k.eat();

	}

}
