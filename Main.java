import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Warehouse Inventory System ---");
        System.out.println("1. Add Product");
        System.out.println("2. View Products");
        System.out.println("3. Search Product");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            inventory.addProduct(new Product(id, name, qty));
            System.out.println("Product added!");

        } else if (choice == 2) {
            inventory.viewProducts();

        } else if (choice == 3) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            inventory.searchProduct(id);

        } else {
            System.out.println("Invalid choice!");
        }

        System.out.println("Program ended.");
    }
}
