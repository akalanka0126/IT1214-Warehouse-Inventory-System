import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<>();

    // Add item
    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item added successfully!");
    }

    // Remove item
    public void removeItem(String id) {
        for (Item item : items) {
            if (item.getItemId().equals(id)) {
                items.remove(item);
                System.out.println("Item removed successfully!");
                return;
            }
        }
        System.out.println("Item not found!");
    }

    // Update quantity
    public void updateQuantity(String id, int newQty) {
        for (Item item : items) {
            if (item.getItemId().equals(id)) {
                item.setQuantity(newQty);
                System.out.println("Quantity updated!");
                return;
            }
        }
        System.out.println("Item not found!");
    }

    // Search by ID
    public void searchById(String id) {
        for (Item item : items) {
            if (item.getItemId().equals(id)) {
                System.out.println(item);
                return;
            }
        }
        System.out.println("Item not found!");
    }

    // Search by Name
    public void searchByName(String name) {
        for (Item item : items) {
            if (item.getItemName().equalsIgnoreCase(name)) {
                System.out.println(item);
                return;
            }
        }
        System.out.println("Item not found!");
    }

    // Display all
    public void displayAll() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        for (Item item : items) {
            System.out.println(item);
        }
    }
}
