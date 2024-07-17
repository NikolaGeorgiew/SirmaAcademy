public class InventoryItem extends AbstractItem{
    private int id;
    private int quantity;
    public InventoryItem(int id,String name, Double price, int quantity, String category, boolean breakable, boolean perishable) {
        super(name, price, quantity, category, breakable, perishable);
        this.id = id;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", category='" + category + '\'' +
                ", breakable=" + breakable +
                ", perishable=" + perishable +
                '}';
    }
}
