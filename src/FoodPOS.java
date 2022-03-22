import java.util.ArrayList;
import java.util.Scanner;

class Bill{
	private String itemName;
	private int price;
	private int quantity;
	private int subtotal;
	
	public Bill(String itemName, int quantity, int price, int subtotal) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}

	@Override
	public String toString() {
		return "Bill [itemName=" + itemName + ", price=" + price + ", quantity=" + quantity + ", subtotal=" + subtotal
				+ "]";
	}
}

class Food{
	private ArrayList<Bill> shoppingCart = new ArrayList<Bill>();
	private int total = 0;
	
	void printMenu() {
		System.out.println("Food Menu");
		System.out.println("----------------------------------------------------------");
		System.out.println("Food ID			Name		Price");
		System.out.println("----------------------------------------------------------");
		System.out.println("1			Water		10");
		System.out.println("2			Coke		20");
		System.out.println("3			Pizza		100");
		System.out.println("4			Burger		150");
		System.out.println("5			Fries		75");	
	}
	
	void pos() {
		Scanner scan = new Scanner(System.in);
		boolean exit = false;
		
		System.out.println("Welcome to the Hotel!");
		System.out.print("Please enter your name : ");
		String s = scan.next();
		
		while(exit == false) {
			printMenu();
			System.out.print("Enter the Food ID you would like to order : ");
			int id = scan.nextInt();
			while(id < 1 || id > 5) {
				System.out.print("Invalid ID! Please eneter a valid Food ID : ");
				id = scan.nextInt();
			}
			System.out.print("Enter the amount of quantity you would like : ");
			int quantity = scan.nextInt();
			addMenu(id, quantity);
			getShoppingCart();
			
			System.out.print("Would you like to buy more food? (y/n) : ");
			String ans = scan.next().toLowerCase();
			char c[] = ans.toCharArray();
			char first = c[0];
			
			while(!ans.equals("y") && !ans.equals("n")) {
				System.out.print("Invalid option, Please try again : ");
				ans = scan.next().toLowerCase();
			}
			
			if(ans.equalsIgnoreCase("n") || ans.equalsIgnoreCase("no")) {
				getShoppingCart();
				System.out.println("Thank you for your purchase!");
				exit = true;
			}
		}
	}
	
	void addMenu(int id, int quantity) {
		switch(id){
			case 1:
				int wTotal = quantity * 10;
				shoppingCart.add(new Bill("Water", quantity, 10, wTotal));
				total += wTotal;
				break;
			case 2:
				int cTotal = quantity * 20;
				shoppingCart.add(new Bill("Coke", quantity, 20, cTotal));
				total += cTotal;
				break;
			case 3:
				int pTotal = quantity * 100;
				shoppingCart.add(new Bill("Pizza", quantity, 100, pTotal));
				total += pTotal;
			case 4:
				int bgTotal = quantity * 150;
				shoppingCart.add(new Bill("Burger", quantity, 150, bgTotal));
				total += bgTotal;
				break;
			case 5:
				int fTotal = quantity * 75;
				shoppingCart.add(new Bill("Fries", quantity, 75, fTotal));
				total += fTotal;
				break;
		}
	}
	
	void getShoppingCart() {
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("Name			Quantity			Price			Subtotal");
		System.out.println("-----------------------------------------------------------------------------------------------------");		
		for(Bill b:shoppingCart) {
			System.out.print(b.getItemName()  +  "			" + b.getQuantity()+  "				"+b.getPrice() +  "			" + b.getSubtotal()  +  "				");
			System.out.println();
		}
		System.out.println("Total : "+total);
	}
}

public class FoodPOS {
	public static void main(String[] args) {
		Food f = new Food();
		f.pos();

	}

}