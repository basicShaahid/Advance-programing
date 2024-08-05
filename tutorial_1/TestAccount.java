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

class CAccount extends Account {

private double limit;
private double overdrawn;
public CAccount(String name, String ID, double balance, double limit) {
super(name, ID, balance);
this.limit = limit;
overdrawn = 0.0;
}

public void deposit(double amt) {
    if (amt >0) {
        if (amt < overdrawn) {
        overdrawn -= amt;
        }
        else {
        super.deposit(amt - overdrawn);
        overdrawn = 0.0;
        }
    }
}

public boolean withdraw(double amt) {
        if (amt > 0 && amt <= getBalance())
            {
            return super.withdraw(amt);
            }
        else if (amt > 0 && amt - getBalance() <= limit - overdrawn) {
            overdrawn += amt - getBalance();
            return super.withdraw(getBalance());
            }
        else {
            return false;
        }
}

public class TestCAccount {
    public static void main(String args[]) {
        CAccount c1 = new CAccount("Tim", "C126", 250, 1000);
        c1.deposit(500);
        System.out.println(c1.getBalance());
        withdrawAttempt(c1, 700);
        withdrawAttempt(c1, 700);
        }

    public static void withdrawAttempt(CAccount c, double amt) {
        if (c.withdraw(amt) == true) {
            System.out.println(c.getName() + " successfully withdrew " + amt);
        } 
        else {
            System.out.println("Attempt to withdraw " + amt + " by " + c.getName() + "failed");
        }
    }
}
}