import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InventoryFileManager {
    private static final String FILE_PATH = "inventory.txt";

    //method to save inventory data to file
    public static void saveInventoryToFile(List<InventoryItem> inventory) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (InventoryItem item : inventory) {
                String line = item.getId() + "," + item.getName() + "," + item.getPrice() +
                        "," + item.getQuantity() + "," + item.getCategory() + "," +
                        item.isBreakable() + "," + item.isPerishable() + ",";
                writer.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Method to load inventory data from file
    public static List<InventoryItem> loadInventoryFromFile() {
        List<InventoryItem> inventory = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);
                int quantity = Integer.parseInt(parts[3]);
                String category = parts[4];
                boolean breakable = Boolean.parseBoolean(parts[5]);
                boolean perishable = Boolean.parseBoolean(parts[6]);
                InventoryItem item = createInvetoryItem(parts);
                inventory.add(item);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return inventory;
    }

    private static InventoryItem createInvetoryItem(String[] parts) {
        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        double price = Double.parseDouble(parts[2]);
        int quantity = Integer.parseInt(parts[3]);
        String category = parts[4];
        boolean breakable = Boolean.parseBoolean(parts[5]);
        boolean perishable = Boolean.parseBoolean(parts[6]);
        return  new InventoryItem(id, name, price, quantity, category, breakable, perishable);
    }


}
