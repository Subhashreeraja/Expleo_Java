package Ass_Class_Objects;

/**
 * Represents a Bank Account.
 */
class Account {

    private final String id;
    private final String name;
    private int balance;

    /**
     * Constructor to create account with zero balance.
     */
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    /**
     * Constructor to create account with initial balance.
     */
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    /**
     * Adds amount to balance.
     */
    public int credit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid credit amount.");
            return balance;
        }

        balance += amount;
        return balance;
    }

    /**
     * Deducts amount from balance.
     */
    public int debit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid debit amount.");
            return balance;
        }

        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeds balance.");
        }

        return balance;
    }

    /**
     * Transfers money to another account.
     */
    public int transferToAccount(Account another, int amount) {

        if (another == null) {
            System.out.println("Invalid account.");
            return balance;
        }

        if (amount <= 0) {
            System.out.println("Invalid transfer amount.");
            return balance;
        }

        if (amount <= balance) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeds balance.");
        }

        return balance;
    }

    /**
     * Returns account details.
     */
    @Override
    public String toString() {
        return "Account [id=" + id +
                ", name=" + name +
                ", balance=" + balance + "]";
    }
}
    /**
     * Main method to test Account class.
     */
    public class ques1{
    public static void main(String[] args) {

        Account account1 = new Account("A101", "Subhashree", 5000);
        Account account2 = new Account("A102", "Anitha");

        account1.credit(2000);
        account1.debit(1000);
        account1.transferToAccount(account2, 3000);

        System.out.println(account1);
        System.out.println(account2);
    }
}