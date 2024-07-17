public class ElectronicsItem extends InventoryItem{
    private String brand;

    public ElectronicsItem(int id, String name, Double price, int quantity, String category, boolean breakable, boolean perishable) {
        super(id,name, price, quantity, category, breakable, perishable);
    }

    @Override
    public double calculateValue() {
        return  getPrice() * getQuantity();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
