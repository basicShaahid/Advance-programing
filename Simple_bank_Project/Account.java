public class Account {
	//attributes
	private String accountID;
	private String accountName;
	private double balance;
	
	//constructor
	// can be an example of method overlaoding - 2 methods with same method names but different inputs
	public Account() {
		this.accountID = "empty";
	
	}
	
	public Account(String id, String name, Double balance) {
		this.accountID = id;
		this.accountName = name;
		this.balance = balance;
	}
	//getter
	
	public String getID() {
		return this.accountID;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	//setter
	public void setID(String newID) {
		this.accountID = newID;
	}
	//void = not returning anything
	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	
	//example of method overriding 
	@Override
	public String toString() {
		return this.accountID + "|" + this.accountName + "|" + this.balance;
	
	}
}
