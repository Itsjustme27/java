public class BankAccount {
    int accountNumber;
    float balance;
    String accountName;

    public BankAccount(int accountNumber, float balance, String accountName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountName = accountName;
        System.out.println("Account number: " + this.accountNumber + "\nBalance: " + this.balance + "\nAccount Name: " + this.accountName);
    }

    public void depositMoney(int depositAmt) {
        System.out.println("You have successfully deposited " + depositAmt + " rupee/s");
        balance = balance + depositAmt;
        System.out.println("Your new balance is " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(111, 90, "Shreevastav");
        acc1.depositMoney(80);
    }
}
