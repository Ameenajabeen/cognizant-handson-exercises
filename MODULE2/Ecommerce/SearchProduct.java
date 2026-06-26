import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SearchProduct {

    // Linear Search
    public static Product linearSearch(Product[] products, int id) {

        for (Product product : products) {

            if (product.productId == id) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int id) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (products[mid].productId == id)
                return products[mid];

            else if (products[mid].productId < id)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Products: ");
        int n = sc.nextInt();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Product " + (i + 1) + " Details");

            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Category: ");
            String category = sc.nextLine();

            products[i] = new Product(id, name, category);
        }

        // Sort array for Binary Search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        System.out.print("\nEnter Product ID to Search: ");
        int searchId = sc.nextInt();

        System.out.println("\n----- Linear Search -----");

        Product result = linearSearch(products, searchId);

        if (result != null)
            System.out.println(result);
        else
            System.out.println("Product Not Found");

        System.out.println("\n----- Binary Search -----");

        result = binarySearch(products, searchId);

        if (result != null)
            System.out.println(result);
        else
            System.out.println("Product Not Found");

        sc.close();
    }
}