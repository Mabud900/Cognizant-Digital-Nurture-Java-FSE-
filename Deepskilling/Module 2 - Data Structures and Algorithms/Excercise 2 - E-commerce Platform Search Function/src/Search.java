import java.util.Scanner;

public class Search {

    public static int linearSearchByProductId(Product[] products, int target) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearchByProductId(Product[] products, int target) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (products[mid].productId == target) {
                return mid;
            } else if (products[mid].productId < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter productId, productName, category:");
            int id = sc.nextInt();
            String name = sc.next();
            String category = sc.next();

            products[i] = new Product(id, name, category);
        }

        System.out.print("Enter target productId: ");
        int target = sc.nextInt();

        int linearAns = linearSearchByProductId(products, target);
        int binaryAns = binarySearchByProductId(products, target);

        System.out.println("Linear search index = " + linearAns);
        System.out.println("Binary search index = " + binaryAns);

        sc.close();
    }
}