
abstract class Bird{
	abstract void fly();
	abstract void eat();
}

abstract class Eagle extends Bird{

	@Override
	void eat() {
		System.out.println("Eagle is eating");	
	}
}

class GoldenEagle extends Eagle{

	@Override
	void fly() {
		System.out.println("Golden Eagle is flying");
	}
}

class SerpantEagle extends Eagle{

	@Override
	void fly() {
		System.out.println("Serpant Eagle is flying");
	}
}

class Sparrow extends Bird{

	@Override
	void fly() {
		System.out.println("Sparrow is flying");
	}

	@Override
	void eat() {
		System.out.println("Sparrow is eating");
	}
	
}
 class BirdFly{
	 void Flying(Bird b) {
		 b.eat();
		 b.fly();
	 }
 }

public class FlyingBirds {

	public static void main(String[] args) {
		GoldenEagle ge =  new GoldenEagle();
		SerpantEagle se = new SerpantEagle();
		Sparrow s =  new Sparrow();
		
		BirdFly f = new BirdFly();
		f.Flying(se);
		f.Flying(ge);
		f.Flying(s);
	}
}
