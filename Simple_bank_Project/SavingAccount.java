public class SavingAccount extends Account {
	public void addInterest(double rate) {
		this.setBalance((this.getBalance())* (1 + rate));
	}
	
	

}