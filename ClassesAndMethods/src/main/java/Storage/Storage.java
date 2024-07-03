package Storage;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private int capacity;
    private List<Product> products;
    public double totalCost;

    public Storage(int capacity) {
        this.capacity = capacity;
        this.products = new ArrayList<>();
    }
    public int getCapacity() {
        return  capacity;
    }
    public double getTotalCost() {
        return totalCost;
    }
    public void addProduct(Product product) {
        int quantity = product.getQuantity();
        if (quantity <= capacity) {
            products.add(product);
            capacity -= quantity;
            totalCost += product.getPrice() * quantity;
        } else {
            System.out.println("Not enough capacity");
        }
    }

    public void getProducts() {
        for (Product product: products) {
            System.out.printf("name: %s, price: %.2f, quantity: %d%n", product.getName(), product.getPrice(), product.getQuantity());
        }
    }
}
