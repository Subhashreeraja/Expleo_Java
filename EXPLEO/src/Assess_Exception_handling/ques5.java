package Assess_Exception_handling;
	import java.util.Scanner;
	import java.util.InputMismatchException;

	// Invoice class
	class Invoice {

	    int partNumber;
	    String partDescription;
	    int quantity;
	    double pricePerItem;

	    // Constructor with four arguments
	    Invoice(int partNumber, String partDescription, int quantity, double pricePerItem) {

	        this.partNumber = partNumber;
	        this.partDescription = partDescription;
	        this.quantity = quantity;
	        this.pricePerItem = pricePerItem;
	    }

	    // Method to display invoice details
	    void displayInvoice() {

	        double total = quantity * pricePerItem;

	        System.out.println("Part Number: " + partNumber);
	        System.out.println("Part Description: " + partDescription);
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Price per Item: " + pricePerItem);
	        System.out.println("Total Amount: " + total);
	    }
	}

	public class ques5 {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        try {

	            // Read part number
	            System.out.print("Enter Part Number: ");
	            int partNumber = sc.nextInt();
	            sc.nextLine();

	            if (partNumber <= 0) {
	                System.out.println("Part number must be greater than 0");
	                return;
	            }

	            // Read description
	            System.out.print("Enter Part Description: ");
	            String description = sc.nextLine();

	            if (description == null || description.trim().isEmpty()) {
	                System.out.println("Part description cannot be empty");
	                return;
	            }

	            // Read quantity
	            System.out.print("Enter Quantity: ");
	            int quantity = sc.nextInt();

	            if (quantity <= 0) {
	                System.out.println("Quantity must be greater than 0");
	                return;
	            }

	            // Read price
	            System.out.print("Enter Price per Item: ");
	            double price = sc.nextDouble();

	            if (price <= 0) {
	                System.out.println("Price must be greater than 0");
	                return;
	            }

	            // Create object
	            Invoice inv = new Invoice(partNumber, description, quantity, price);

	            // Display invoice
	            System.out.println("\nInvoice Details:");
	            inv.displayInvoice();

	        }

	        // Handle wrong datatype input
	        catch (InputMismatchException e) {
	            System.out.println("Invalid input type entered.");
	        }

	        sc.close();
	    }
	}
	


