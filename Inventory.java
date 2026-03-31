public class Inventory {
    private Product p1;
    private Product p2;

    public void addProduct(Product p) {
        if (p1 == null) {
            p1 = p;
        } else if (p2 == null) {
            p2 = p;
        } else {
            System.out.println("Inventory full!");
        }
    }

    public void viewProducts() {
        if (p1 != null) {
            p1.display();
        }
        if (p2 != null) {
            p2.display();
        }
        if (p1 == null && p2 == null) {
            System.out.println("No products available.");
        }
    }

    public void searchProduct(int id) {
        if (p1 != null && p1.getId() == id) {
            System.out.println("Product Found:");
            p1.display();
        } else if (p2 != null && p2.getId() == id) {
            System.out.println("Product Found:");
            p2.display();
        } else {
            System.out.println("Product not found.");
        }
    }
}
