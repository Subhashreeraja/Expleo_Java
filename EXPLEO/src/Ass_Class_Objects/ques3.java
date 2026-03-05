package Ass_Class_Objects;


public class ques3 {
    public static void main(String[] args) {

        Cart cart = new Cart();

        Product product1 = new Product(101, "Laptop", 55000.0, 1);
        Product product2 = new Product(102, "Mouse", 500.0, 2);

        cart.addProduct(product1);
        cart.addProduct(product2);

        cart.displayCartItems();

        cart.removeProduct(102);

        cart.displayCartItems();
    }
}


	
