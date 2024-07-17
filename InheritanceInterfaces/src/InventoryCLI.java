import java.util.*;

public class InventoryCLI {
    private static List<InventoryItem> inventory = new ArrayList<>();
    private static int nextItemId = 1;

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        inventory.add(new ElectronicsItem( 1, "Smart TV", 2000.21,1, "Electronics", true, false));
        inventory.add(new GroceryItem( 2, "Apple", 1.20, 2, "fruits", false, false));
        inventory.add(new FragileItem( 3, "Wine Glasses", 25.50, 10, "KitchenWare", true, false));

        boolean exit = false;

        while (!exit) {
            displayMenu();
            System.out.println("Enter your choice");
            String choice = scanner.nextLine();

            switch (choice.toLowerCase()) {
                case "1":
                    addItem(scanner);
                    break;
                case "2":
                    removeItem(scanner);
                    break;
                case "3":
                    displayItems();
                    break;
                case "4":
                    categorizeItems(scanner);
                    break;
                case "5":
                    placeOrder(scanner);
                    break;
                case "6":
                    exit = true;
                    System.out.println("Exiting Inventory System. Goodbye!");
                default:
                    System.out.println("Invalid choice. Please enter a valid option");
                    break;
            }
        }
    }

    private static void placeOrder(Scanner scanner) {

    }

    private static void categorizeItems(Scanner scanner) {
        //Create a map to store items categorized by their categories
        Map<String, List<InventoryItem>> categorizedItems = new HashMap<>();

        //Group items by category
        for (InventoryItem item : inventory) {
            String category = item.getCategory();
            if (!categorizedItems.containsKey(category)) {
                categorizedItems.put(category, new ArrayList<>());
            }
            categorizedItems.get(category).add(item);
        }

        //Print categorized items
        System.out.println("===== Categorized Inventory Items =====");
        for (Map.Entry<String, List<InventoryItem>> entry : categorizedItems.entrySet()) {
            System.out.println("Category: " + entry.getKey());
            for (InventoryItem item : entry.getValue()) {
                System.out.println("- " + item);
            }
        }
    }

    private static void displayItems() {
        System.out.println("===== Inventory Items =====");
        for (InventoryItem item : inventory) {
            System.out.println(item);
        }
    }

    private static void removeItem(Scanner scanner) {
        System.out.println("Enter item ID to remove: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean removed = false;

        for (InventoryItem item : inventory) {
            if (item.getId() == id) {
                inventory.remove(item);
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("Item with ID " + id + " removed successfully.");
        } else {
            System.out.println("Item with ID " + id + " not found");
        }
    }

    private static void addItem(Scanner scanner) {
        System.out.println("Enter your item id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter your item name: ");
        String name = scanner.nextLine();

        System.out.println("Enter item price:");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter item quantity:");
        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter item category:");
        String category = scanner.nextLine();

        System.out.println("Is the item breakable? (true/false): ");
        boolean breakable = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Is the item perishable? (true/false): ");
        boolean perishable = Boolean.parseBoolean(scanner.nextLine());

        InventoryItem item = new InventoryItem(id,name,price,quantity,category,breakable,perishable);

        inventory.add(item);
        System.out.println("Item added successfully");
    }

    private static void displayMenu() {
        System.out.println("===== Inventory Management System Menu =====");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item by ID");
        System.out.println("3. Display Items");
        System.out.println("4. Categorize Items");
        System.out.println("5. Place Order");
        System.out.println("6. Exit");
    }
}
