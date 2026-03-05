package Ass_Class_Objects;


public class Product {

    // Private attributes (Encapsulation)
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    // Constructor
    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        setQuantity(quantity); // use setter for validation
    }

    // Getter methods
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setter method with validation
    public void setQuantity(int newQuantity) {
        if (newQuantity >= 0) {
            this.quantity = newQuantity;
        } else {
            System.out.println("Quantity cannot be negative.");
        }
    }

    // Calculate total price for this product
    public double calculateTotal() {
        return price * quantity;
    }

    // Display product details
    public String getProductDetails() {
        return "Product ID: " + productId +
               ", Name: " + productName +
               ", Price: " + price +
               ", Quantity: " + quantity +
               ", Total: " + calculateTotal();
    }
}

