import java.util.Scanner;

class InvalidCredException extends Exception{
	public String getMessage() {
		return "Wrong credentials";
	}
}

class InvalidAmountException extends Exception{
	public String getMessage() {
		return "Money cannot be withdrawn as it is exceeds the amount you have";
	}
}

class Atm{
	String username;
	String password;
	int amount;
	
	public Atm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Atm(String username, String password, int amount) {
		super();
		this.username = username;
		this.password = password;
		this.amount = amount;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	boolean credCheck(String un, String p){
		if(username.equals(un) && password.equals(p)) {
				return true;
		}	
		return false;
		
	}
	
	void collectMoney(int w) throws InvalidAmountException {
		if(w > amount) {
			InvalidAmountException iae = new InvalidAmountException();
			throw iae;
		}
		else {
			amount -= w;
			System.out.println("Money has been withdrawn");
			System.out.println("New amount : " + amount);
		}
	}
	
	
	void launchAtm() throws InvalidAmountException, InvalidCredException {
		int loginAttempt = 0;
		
		while(loginAttempt < 3) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter Username : ");
			String n = scan.next();
			System.out.print("Enter Password : ");
			String p = scan.next();
			
			boolean cc = credCheck(n,p);
			if(cc == true) {
				System.out.print("Enter amount to be withdrawn : ");
				int w = scan.nextInt();
				try {
					collectMoney(w);
				} catch (InvalidAmountException e) {
					// TODO Auto-generated catch block
					throw e;
				}
			}
			else {
				System.out.println("Invalid Login!");
				loginAttempt++;
				if(loginAttempt >=3 ) {
					InvalidCredException ice = new InvalidCredException();
					System.out.println("Too many logins! Account locked!");
					throw ice;
				}
			}
		}
	}
}

class Bank{
	void launchAtm() {
		Atm a = new Atm("abc","123",3000);
		try {
			a.launchAtm();
		} catch (InvalidCredException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Bank received!");
		}
	}
}

public class LoginApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		
		b.launchAtm();
		
	}

}