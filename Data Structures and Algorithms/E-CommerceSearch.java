class Product{
    int productId;
    String productName;
    String category;

    Product(int id, String name, String cat){
        productId = id;
        productName = name;
        category = cat;
    }
}

public class Ecommerce{
    public static void linearSearch(Product[] products, int targetId){
        boolean found = false;
        for (int i = 0; i < products.length; i++){
            if (products[i].productId == targetId){
                System.out.println("Product Found using Linear Search:");
                System.out.println("ID: " + products[i].productId);
                System.out.println("Name: " + products[i].productName);
                System.out.println("Category: " + products[i].category);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Product not found using Linear Search.");
        }
    }

    public static void binarySearch(Product[] products, int targetId){
        int start = 0;
        int end = products.length - 1;
        boolean found = false;
        while (start <= end){
            int mid = (start + end) / 2;
            if (products[mid].productId == targetId){
                System.out.println("Product Found using Binary Search:");
                System.out.println("ID: " + products[mid].productId);
                System.out.println("Name: " + products[mid].productName);
                System.out.println("Category: " + products[mid].category);
                found = true;
                break;
            }else if (products[mid].productId < targetId){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        if (!found){
            System.out.println("Product not found using Binary Search.");
        }
    }

    public static void main(String[] args){
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Watch", "Accessories"),
            new Product(104, "Phone", "Electronics"),
            new Product(105, "Bag", "Accessories")
        };
        int targetId = 103;
        linearSearch(products, targetId);
        binarySearch(products, targetId);
    }
}
