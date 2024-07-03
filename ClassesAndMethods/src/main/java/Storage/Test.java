package Storage;

public class Test {
    public static void main(String[] args) {

        Product cucumber = new Product("cucumber", 1.50, 15);
        Product tomato = new Product("tomato", 0.90, 25);
        Product bread = new Product("bread", 1.10, 8);

        Storage storage = new Storage(50);
        storage.addProduct(cucumber);
        storage.addProduct(tomato);
        storage.addProduct(bread);
        storage.getProducts();


        System.out.println(storage.getCapacity());
        System.out.println(storage.getTotalCost());

    }
}
