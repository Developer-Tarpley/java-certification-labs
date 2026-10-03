import java.util.ArrayList;

public class BankAccount {
    private double balance;
    private ArrayList<Transactions> transactions;

    public BankAccount() {
        this.balance = 0;
        this.transactions = new ArrayList<>();

    };

    class Transactions {
        private String type;
        private double amount;

        public Transactions(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }

        public String getType(){
            return type;
        }

        public double getAmount(){
            return amount;
        }

        public String toString() {
            return String.format("{type: \"%s\", amount: %.2f}", type, amount);
        }

    }

    public String deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            this.transactions.add(new Transactions("deposit", amount));
            return String.format("Successfully deposited %.2f. New balance %.2f", amount, this.balance);
        }
        return "Deposit amount must be greater than zero.";

    };

    public String withdraw(double amount) {

        if (this.balance >= amount) {
            this.balance -= amount;
            this.transactions.add(new Transactions("withdrawal", amount));
            return String.format("Successfully withdrew %.2f. New balance: %.2f", amount, this.balance);
        }

        return "Insufficient balance or invalid amount.";
    }

    public String checkBalance() {

        // You should define a method named checkBalance that returns the current
        // balance in the format "Current balance: $[balance]".
        return String.format("Current balance: %.2f", this.balance);
    }

    public String listAllDeposits() {

        // You should define a method named listAllDeposits that iterates through the
        // transactions array and returns all deposits in the format "Deposits:
        // amount,amount,...".
        for (int i = 0; i < this.transactions.size(); i++) {
            System.out.println(this.transactions.get(i));
            Transactions t = this.transactions.get(i);
            System.out.println(t.getType());
            System.out.println(t.getAmount());
            if(t.getType() == "deposit"){
                return String.format("Deposits: %d", t.getAmount());
            }
        }

        return String.format("Deposits: ");

    }

    public String listAllWithdrawals() {

        // You should define a method named listAllWithdrawals that iterates through the
        // transactions array and returns all withdrawals in the format "Withdrawals:
        // amount,amount,...".
        return String.format("Withdrawals: %.2f");

    }

    public static void main(String[] args) {

        // You should create a new instance of BankAccount named myAccount.
        BankAccount myAccount = new BankAccount();
        System.out.println(myAccount.deposit(150));
        System.out.println(myAccount.deposit(100));
        System.out.println(myAccount.deposit(375));

        System.out.println(myAccount.withdraw(175));
        System.out.println(myAccount.withdraw(35.50));

        System.out.println(myAccount.checkBalance());
        System.out.println(myAccount.listAllDeposits());
        System.out.println(myAccount.transactions.toString());

        // Your myAccount bank account should have at least five transactions.

        // Your myAccount bank account should have at least two deposits.

        // Your myAccount bank account should have at least two withdrawals.

        // Your myAccount bank account should have a balance greater than $100.

    }
}
