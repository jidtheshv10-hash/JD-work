class BankAccount {
    private double balance;
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance() {
        return balance;
    }
}
public class bnkacc {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(5000);
        account.withdraw(2000);
        System.out.println("Balance: " + account.getBalance());
    }
}