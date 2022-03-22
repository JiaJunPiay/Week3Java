class Animal{
	String name;
	int age;
	
	void animalSound() {
		System.out.println("rawr");
	}
}
class Elephant extends Animal{
	String feed;
	
	void animalSound() {
		System.out.println("eeeeeeeeeeee");
	}
}

class Zoo{

	Elephant animalType() {
		Elephant e = new Elephant();
		
		return e;
	}
}

class Enclosure{
	Animal animalType() {
		Animal a  = new Animal();
		
		return a;
		
	}
	
}

public class CovariantReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zoo z = new Zoo();
		Enclosure e = new Enclosure();
		//Animal a = z.animalType();
		//Elephant el = e.animalType();
		
		//a.animalSound();
		//el.animalSound();
		
		

	}

}
