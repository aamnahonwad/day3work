public class BankAccount {

    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    public double getBalance() {
        return balance;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        BankAccount s = new SavingsAccount(5000);  // Polymorphism
        s.withdraw(6000);

        System.out.println("Balance: " + s.getBalance());
    }
}

// Inheritance
class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    // Polymorphism (Method Overriding)
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance())
            super.withdraw(amount);
        else
            System.out.println("Savings: Not enough balance");
    }
}