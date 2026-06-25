import java.util.HashMap;
import java.util.Scanner;

public class InventoryManagement {

    private HashMap<Integer, Product> inventory = new HashMap<>();

    // Add Product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product Added Successfully!");
    }

    // Update Product
    public void updateProduct(int productId, String name, int quantity, double price) {

        Product product = inventory.get(productId);

        if (product != null) {
            product.setProductName(name);
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product Updated Successfully!");
        } else {
            System.out.println("Product Not Found!");
        }
    }

    // Delete Product
    public void deleteProduct(int productId) {

        if (inventory.remove(productId) != null) {
            System.out.println("Product Deleted Successfully!");
        } else {
            System.out.println("Product Not Found!");
        }
    }

    // Display Products
    public void displayProducts() {

        if (inventory.isEmpty()) {
            System.out.println("Inventory is Empty.");
            return;
        }

        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {

        InventoryManagement ims = new InventoryManagement();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Inventory Management System =====");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Products");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    ims.addProduct(new Product(id, name, quantity, price));
                    break;

                case 2:

                    System.out.print("Enter Product ID to Update: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Product Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter New Quantity: ");
                    quantity = sc.nextInt();

                    System.out.print("Enter New Price: ");
                    price = sc.nextDouble();

                    ims.updateProduct(id, name, quantity, price);
                    break;

                case 3:

                    System.out.print("Enter Product ID to Delete: ");
                    id = sc.nextInt();

                    ims.deleteProduct(id);
                    break;

                case 4:

                    ims.displayProducts();
                    break;

                case 5:

                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}