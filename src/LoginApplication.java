import java.util.Scanner;

class Atm{
	private String username;
	private String password;
	private int money;
	
	public Atm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Atm(String username, String password, int money) {
		super();
		this.username = username;
		this.password = password;
		this.money = money;
	}
	
	boolean credCheck(String un, String p) throws InvalidCred{
		if(username.equals(un) && password.equals(p)) {
				return true;
		}
		else {
			InvalidCred ic = new InvalidCred();
			throw ic;
		}
		
	}
	
	void collectMoney(int w) {
		if(w > money) {
			System.out.println("Money cannot be withdrawn as it is exceeds the amount you have");
		}
		else {
			money -= w;
			System.out.println("Money has been withdrawn");
			System.out.println("New amount : " + money);
		}
	}
	
	void launchWithdraw() {
		int count = 0;
		Scanner scan = new Scanner(System.in);
		Bank b = new Bank();
		while (count <= 3) {
			System.out.print("Enter Username : ");
			String n = scan.next();
			b.setAccountName(n);
			System.out.print("Enter Password : ");
			String p = scan.next();
			
			boolean valid = false;
			try {
				valid = credCheck(n, p);
			} catch (InvalidCred e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(valid == true) {
				System.out.print("Enter amount to be withdrawn : ");
				int w = scan.nextInt();
				collectMoney(w);
				break;
			}
			else {
				System.out.println("Invalid Login!");
				count++;
				b.setLoginAttempts(count);
				if(b.getAccountName() == n && b.getLoginAttempts() >= 3) {
					System.out.println("Too many logins! Account locked!");
					break;
				}	
			}
		}
	}
}

class Bank{
	private String accountName;
	private int loginAttempts;
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(String accountName, int loginAttempts) {
		super();
		this.accountName = accountName;
		this.loginAttempts = loginAttempts;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getLoginAttempts() {
		return loginAttempts;
	}
	public void setLoginAttempts(int loginAttempts) {
		this.loginAttempts = loginAttempts;
	}
}

class InvalidCred extends Exception{
	
}

public class LoginApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm a = new Atm("abc","123",3000);
		a.launchWithdraw();
	}

}
