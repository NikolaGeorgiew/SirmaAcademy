public class GroceryItem extends InventoryItem{
    private  boolean organic;
    public GroceryItem( int id, String name, Double price, int quantity, String category, boolean breakable, boolean perishable) {
        super(id, name, price, quantity, category, breakable, perishable);

    }

    @Override
    public double calculateValue() {
        return  getPrice() * getQuantity();
    }

    public boolean isOrganic() {
        return organic;
    }

    public void setOrganic(boolean organic) {
        this.organic = organic;
    }
}
