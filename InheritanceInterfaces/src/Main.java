import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<InventoryItem> inventory = new ArrayList<>();
//        inventory.add(new ElectronicsItem( 1, "Smart TV", 2000.21,1, "Electronics", true, false));
//        inventory.add(new GroceryItem( 2, "Apple", 1.20, 2, "fruits", false, false));
//        inventory.add(new FragileItem( 3, "Wine Glasses", 25.50, 10, "KitchenWare", true, false));
//
//
//        InventoryFileManager.saveInventoryToFile(inventory);
//
//        List<InventoryItem> loadedInvetory = InventoryFileManager.loadInventoryFromFile();
//        System.out.println("Loaded Inventory: ");
//        for (InventoryItem item : loadedInvetory) {
//            System.out.println(item.getItemDetails());
//        }

        InventoryCLI.start();
    }
}
