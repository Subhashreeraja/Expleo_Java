package Ass_Inheri_Poly;
import java.util.Scanner;
abstract class Payment{
	
	protected String transactionId;
	protected double amount;
	protected String customerName;
	protected String paymentStatus;
	
	Payment(String transactionId, double amount, String customerName){
		this.transactionId=transactionId;
	    this.amount=amount;
		this.customerName=customerName;
	}
	abstract boolean validatePayment();
	abstract boolean processPayment();

	void executeTransaction() {
		
			 if (validatePayment()) {
			 if (processPayment()) {
			 setPaymentStatus("Success");
			} else {
			 setPaymentStatus("Failed");
			}
			} else {
			 setPaymentStatus("Validation Failed");
			}
			 generateReceipt();
			}


	void generateReceipt() {
		System.out.println("----Transaction Details----");
		System.out.println("Transaction ID: "+transactionId);
		System.out.println("Amount: "+amount);
		System.out.println("Customer Name:"+customerName);
		System.out.println("Payment Status: "+paymentStatus);
		
	}
	
	public String getTransactionId() {
		return transactionId;
	}
	 
	public double getAmount() {
		return amount;
	}
	public void setPaymentStatus(String status) {
		paymentStatus=status;
	}
	
}

class CreditCardPayment extends Payment{
	String cardNumber;
	String cvv;
	String expiryDate;
	
	CreditCardPayment(String transactionId,double amount,
            String customerName,String cardNumber, String cvv, String expiryDate){
		super(transactionId,amount,customerName);
		this.cardNumber=cardNumber;
		this.cvv=cvv; 
		this.expiryDate=expiryDate;
	}
	boolean validatePayment() {

        if(cardNumber.length()==16 && cvv.length()==3){
            System.out.println("Credit Card Validation Successful");
            return true;
        }
        else{
            System.out.println("Credit Card Validation Failed");
            return false;
        }
	}
	boolean processPayment() {
		 System.out.println("Processing Credit Card Payment...");
	        System.out.println("Amount deducted from card.");
	        return true;
	}
}
class UPIPayment extends Payment{
	String upiId;
	String upiPin;
	 UPIPayment(String transactionId,double amount,
             String customerName,String upiId,String upiPin){

      super(transactionId,amount,customerName);

      this.upiId = upiId;
      this.upiPin = upiPin;
  }

  @Override
  public boolean validatePayment(){

      if (upiId.contains("@") && upiPin.length()==4){
          System.out.println("UPI Validation Successful");
          return true;
      }
      else{
          System.out.println("UPI Validation Failed");
          return false;
      }
  }

  @Override
  public boolean processPayment(){

      System.out.println("Processing UPI Payment...");
      System.out.println("Amount deducted via UPI.");
      return true;
  }
}
class NetBankingPayment extends Payment{

    String bankName;
    String accountNumber;
    String ifscCode;

    NetBankingPayment(String transactionId,double amount,
                      String customerName,String bankName,
                      String accountNumber,String ifscCode){

        super(transactionId,amount,customerName);

        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
    }

    @Override
    public boolean validatePayment(){

        if(accountNumber.length()>=10 && ifscCode.length()==11){
            System.out.println("Net Banking Validation Successful");
            return true;
        }
        else{
            System.out.println("Net Banking Validation Failed");
            return false;
        }
    }

    @Override
    public boolean processPayment(){

        System.out.println("Processing NetBanking Payment...");
        System.out.println("Amount deducted via NetBanking.");
        return true;
    }
}


public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        Payment payment = null;

        System.out.println("Choose Payment Method");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the transaction ID:");
        String transactionId = sc.nextLine();

        System.out.println("Enter Customer Name:");
        String customerName = sc.nextLine();

        System.out.println("Enter Amount:");
        double amount = sc.nextDouble();
        sc.nextLine();

        switch(choice){

        case 1:

            System.out.println("Enter Card Number:");
            String cardNumber = sc.nextLine();

            System.out.println("Enter CVV:");
            String cvv = sc.nextLine();

            System.out.println("Enter Expiry Date:");
            String expiryDate = sc.nextLine();

            payment = new CreditCardPayment(
                    transactionId,amount,customerName,
                    cardNumber,cvv,expiryDate);

            break;

        case 2:

            System.out.println("Enter UPI ID:");
            String upiId = sc.nextLine();

            System.out.println("Enter UPI PIN:");
            String upiPin = sc.nextLine();

            payment = new UPIPayment(
                    transactionId,amount,customerName,
                    upiId,upiPin);

            break;

        case 3:

            System.out.println("Enter Bank Name:");
            String bankName = sc.nextLine();

            System.out.println("Enter Account Number:");
            String accountNumber = sc.nextLine();

            System.out.println("Enter IFSC Code:");
            String ifscCode = sc.nextLine();

            payment = new NetBankingPayment(
                    transactionId,amount,customerName,
                    bankName,accountNumber,ifscCode);

            break;

        default:
            System.out.println("Invalid Choice");
            return;
        }

        payment.executeTransaction();

	}

}
