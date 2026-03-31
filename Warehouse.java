import java.util.Scanner;

public class Warehouse {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Warehouse Inventory System ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Quantity");
            System.out.println("4. Search Item");
            System.out.println("5. View Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (choice == 1) {
                System.out.print("Enter ID: ");
                String id = sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Quantity: ");
                int qty = sc.nextInt();

                System.out.print("Enter Price: ");
                double price = sc.nextDouble();

                inventory.addItem(new Item(id, name, qty, price));

            } else if (choice == 2) {
                System.out.print("Enter ID to remove: ");
                String id = sc.nextLine();
                inventory.removeItem(id);

            } else if (choice == 3) {
                System.out.print("Enter ID: ");
                String id = sc.nextLine();

                System.out.print("Enter new quantity: ");
                int qty = sc.nextInt();

                inventory.updateQuantity(id, qty);

            } else if (choice == 4) {
                System.out.println("1. Search by ID");
                System.out.println("2. Search by Name");
                int opt = sc.nextInt();
                sc.nextLine();

                if (opt == 1) {
                    System.out.print("Enter ID: ");
                    inventory.searchById(sc.nextLine());
                } else {
                    System.out.print("Enter Name: ");
                    inventory.searchByName(sc.nextLine());
                }

            } else if (choice == 5) {
                inventory.displayAll();

            } else if (choice == 6) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
