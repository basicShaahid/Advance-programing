class Account {

private String name;
private String ID;
public double balance;

    public void Account(String name, String ID, double balance) {
    name = name;
    ID = ID;
    balance = balance;

    }

    public void getBalance(){ 
        return balance;
    }

    public void withdraw(double amt){
        balance -= amt;
    }

    public void deposit(double amt){
        balance += amt;
    }
}
public class TestAccount {
    public static void main(String args[]) 
    {
    Account a1 = new Account("Tan A K", "S123", 24.5);
    Account a2 = new Account("Smith T", "S124", 1200.0);
    a1.deposit(100);
    a1.withdraw(2000);
    a2.deposit(120);
    a2.withdraw(80);
    System.out.println("Balance for " + a1.name + " is " + a1.getBalance());
    System.out.println("Balance for " + a2.name + " is " + a2.getBalance());

    }
}