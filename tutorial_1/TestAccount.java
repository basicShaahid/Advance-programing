class Account {
    private String name;
    private String ID;
    public double balance;
    private int withdrawals; 

    public Account(String name, String ID, double balance) {
        this.name = name;
        this.ID = ID;
        this.balance = balance;
        this.withdrawals = 0;
    }
    public double getBalance() {
        return balance;
    }
    public boolean withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
            withdrawals++;
            return true;
        } else {
            System.out.println("Insufficient balance for withdrawal of " + amt);
            return false;
        }
    }
    public void deposit(double amt) {
        balance += amt;
    }
    public void addInterest(double interestRate) {
        balance += balance * (interestRate / 100);
    }
    public String getName() {
        return name;
    }
}


public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account("Tan A K", "S123", 24.5);
        Account a2 = new Account("Smith T", "S124", 1200.0);
        
        a1.deposit(100);
        a1.withdraw(2000);
        a2.deposit(120);
        a2.withdraw(80);
        System.out.println("Balance for " + a1.getName() + " is " + a1.getBalance());
        System.out.println("Balance for " + a2.getName() + " is " + a2.getBalance());
        a2.addInterest(5.0);
        System.out.println("Balance for " + a2.getName() + " after adding interest is " + a2.getBalance());
    }
}
