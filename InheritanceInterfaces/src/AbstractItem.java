import interfaces.*;

public abstract class AbstractItem implements Item, Categorizable, Breakable, Perishable, Sellable {
    protected String name;
    protected Double price;
    protected int quantity;
    protected String category;
    protected boolean breakable;
    protected boolean perishable;

    public AbstractItem(String name, Double price, int quantity, String category, boolean breakable, boolean perishable) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.breakable = breakable;
        this.perishable = perishable;
    }

    @Override
    public boolean isBreakable() {
        return breakable;
    }

    @Override
    public void handleBreakage() {
        if (breakable && quantity > 0) {
            quantity--;
            System.out.println("interfaces.Item " + name + " has been marked as broken.");
            System.out.println("Remaining Quantity: " + quantity);
        } else {
            System.out.println("No more " + name + " left to break!");
        }
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public String getItemDetails() {
        return "Name: " + name + ", Price: $" + price + ", Quantity: " + quantity + ", Category: " + category + ", interfaces.Breakable: " + breakable + ", interfaces.Perishable: " + perishable;
    }

    @Override
    public double calculateValue() {
        return price * quantity;
    }

    @Override
    public void displayItemDescription() {
        System.out.println("interfaces.Item: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Category: " + category);
        System.out.println("interfaces.Breakable: " + breakable);
        System.out.println("interfaces.Perishable: " + perishable);
    }

    @Override
    public boolean isPerishable() {
        return perishable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBreakable(boolean breakable) {
        this.breakable = breakable;
    }

    public void setPerishable(boolean perishable) {
        this.perishable = perishable;
    }

    @Override
    public void handleExpiration() {
        if (perishable && quantity > 0) {
            quantity--;
            System.out.println("interfaces.Item " + name + " has expired and is removed from inventory.");
            System.out.println("Remaining Quantity: " + quantity);
        } else {
            System.out.println("No more " + name + " left to expire!");
        }
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
