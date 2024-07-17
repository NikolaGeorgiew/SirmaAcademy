public class FragileItem extends InventoryItem{
    private double weight;
    public FragileItem(int id, String name, Double price, int quantity, String category, boolean breakable, boolean perishable) {
        super(id, name, price, quantity, category, breakable, perishable);
    }

    @Override
    public double calculateValue() {
        return getPrice() * getQuantity() * (1 + weight * 0.1);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
