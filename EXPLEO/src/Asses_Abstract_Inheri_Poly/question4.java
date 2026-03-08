package Asses_Abstract_Inheri_Poly;



class Customer {
    private String customerName;
    private String customerId;

    public Customer(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public void displayCustomer() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Customer ID   : " + customerId);
    }
}

class Account {
    private String accountNumber;
    private String accountType;
    private double balance;

    public Account(String accountNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type  : " + accountType);
        System.out.println("Balance       : " + balance);
    }
}

/* Base Class */
class RBI {

    Customer customer;   
    Account account;     

    public RBI(Customer customer, Account account) {
        this.customer = customer;
        this.account = account;
    }

    public double getInterestRate() {
        return 4.0; // Minimum interest rate set by RBI
    }

    public double getWithdrawalLimit() {
        return 20000;
    }

    public void displayDetails() {
        customer.displayCustomer();
        account.displayAccount();
    }
}

/* Derived Class SBI */
class SBI extends RBI {

    public SBI(Customer customer, Account account) {
        super(customer, account);
    }

    @Override
    public double getInterestRate() {
        return 4.5;
    }

    @Override
    public double getWithdrawalLimit() {
        return 25000;
    }
}

/* Derived Class ICICI */
class ICICI extends RBI {

    public ICICI(Customer customer, Account account) {
        super(customer, account);
    }

    @Override
    public double getInterestRate() {
        return 5.0;
    }

    @Override
    public double getWithdrawalLimit() {
        return 30000;
    }
}

/* Derived Class PNB */
class PNB extends RBI {

    public PNB(Customer customer, Account account) {
        super(customer, account);
    }

    @Override
    public double getInterestRate() {
        return 4.2;
    }

    @Override
    public double getWithdrawalLimit() {
        return 20000;
    }
}

/* Main Class */
public class  question4  {

    public static void main(String[] args) {

        Customer c = new Customer("Rahul", "C101");
        Account a = new Account("ACC12345", "Savings", 50000);

        RBI bank;

        System.out.println("----- SBI Bank -----");
        bank = new SBI(c, a);
        bank.displayDetails();
        System.out.println("Interest Rate   : " + bank.getInterestRate() + "%");
        System.out.println("Withdrawal Limit: " + bank.getWithdrawalLimit());

        System.out.println("\n----- ICICI Bank -----");
        bank = new ICICI(c, a);
        System.out.println("Interest Rate   : " + bank.getInterestRate() + "%");
        System.out.println("Withdrawal Limit: " + bank.getWithdrawalLimit());

        System.out.println("\n----- PNB Bank -----");
        bank = new PNB(c, a);
        System.out.println("Interest Rate   : " + bank.getInterestRate() + "%");
        System.out.println("Withdrawal Limit: " + bank.getWithdrawalLimit());
    }
}

