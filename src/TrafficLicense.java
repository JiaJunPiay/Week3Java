import java.util.Scanner;

class Applicant{
	String name;
	int age;
	public Applicant(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}


class Branch{
	void applyLicense(Applicant a) {
		if(a.age < 18) {
			System.out.println("Can't apply as below 18.");
		}
		else {
			System.out.println("Applied!");
		}
	}
}

public class TrafficLicense {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Name : ");
		String n = scan.next();
		System.out.print("Age : ");
		int a = scan.nextInt();
		Applicant app = new Applicant(n, a);
		
		Branch b = new Branch();
		b.applyLicense(app);
	}
}
