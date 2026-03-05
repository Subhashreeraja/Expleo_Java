package Ass_Class_Objects;


import java.util.ArrayList;
import java.util.List;

public class Cart {

    // Private attribute
    private List<Product> products;

    // Constructor
    public Cart() {
        products = new ArrayList<>();
    }

    // Add product to cart
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added successfully.");
    }

    // Remove product by productId
    public void removeProduct(int productId) {
        boolean removed = products.removeIf(product -> product.getProductId() == productId);

        if (removed) {
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Calculate total cart value
    public double calculateCartTotal() {
        double total = 0;

        for (Product product : products) {
            total += product.calculateTotal();
        }

        return total;
    }

    // Display all cart items
    public void displayCartItems() {
        if (products.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("\nCart Items:");
        for (Product product : products) {
            System.out.println(product.getProductDetails());
        }

        System.out.println("Total Cart Value: " + calculateCartTotal());
    }
}

