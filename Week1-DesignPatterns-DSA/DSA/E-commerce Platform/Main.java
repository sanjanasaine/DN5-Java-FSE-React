public class Main {

    public static void main(String[] args) {

        Product[] products = {

            new Product(101, "Camera", "Electronics"),
            new Product(102, "Laptop", "Electronics"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "Tablet", "Electronics"),
            new Product(105, "Watch", "Accessories")
        };

        Product linearResult =
                linearSearch(products, "Tablet");

        System.out.println("Linear Search Result:");
        System.out.println(linearResult);

        Product binaryResult =
                binarySearch(products, "Tablet");

        System.out.println("\nBinary Search Result:");
        System.out.println(binaryResult);
    }

    public static Product linearSearch(
            Product[] products,
            String target) {

        for(Product product : products) {

            if(product.getProductName()
                    .equalsIgnoreCase(target)) {

                return product;
            }
        }

        return null;
    }

    public static Product binarySearch(
            Product[] products,
            String target) {

        int left = 0;
        int right = products.length - 1;

        while(left <= right) {

            int mid = (left + right) / 2;

            int comparison =
                    products[mid]
                    .getProductName()
                    .compareToIgnoreCase(target);

            if(comparison == 0) {
                return products[mid];
            }
            else if(comparison < 0) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return null;
    }
}