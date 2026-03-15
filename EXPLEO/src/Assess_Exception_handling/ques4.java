package Assess_Exception_handling;
//Custom Exception
class PayOutOfBoundsException extends Exception {

 PayOutOfBoundsException(String msg) {
     super(msg);
 }
}

//Account management class
class AccountManagement {

 int balance = 80000;

 // Check if debit amount is valid
 void checkForDebit(int amount) throws PayOutOfBoundsException {

     if (amount > 30000) {
         throw new PayOutOfBoundsException("Transaction limit exceeded (Max 30000)");
     }

     if (amount > balance) {
         throw new PayOutOfBoundsException("Insufficient balance");
     }
 }

 // Withdraw method
 void withdrawAmount(int amount) throws PayOutOfBoundsException {

     checkForDebit(amount);

     balance = balance - amount;

     System.out.println("Withdrawal successful");
     System.out.println("Remaining Balance: " + balance);
 }
}

//Main class
public class ques4  {

 public static void main(String[] args) {

     AccountManagement acc = new AccountManagement();

     try {

         acc.withdrawAmount(20000);

     } catch (PayOutOfBoundsException e) {
         System.out.println(e.getMessage());
     }
 }
}

