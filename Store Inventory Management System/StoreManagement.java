import java.util.ArrayList;
import java.util.Iterator;

public class StoreManagement implements CRUD {
    private final ArrayList<Product> products = new ArrayList<>();

    public StoreManagement() {
    }

    @Override
    public boolean addProduct(Product product) {
        if (product == null || findProduct(product.getId()) != null) {
            return false;
        }
        products.add(product);
        return true;
    }

    @Override
    public Product findProduct(String id) {
        for (Product p : products) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean updateProduct(String id, double newBasePrice) {
        Product p = findProduct(id);
        if (p == null) {
            return false;
        }
        p.setBasePrice(newBasePrice);
        return true;
    }

    @Override
    public boolean deleteProduct(String id) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product p = iterator.next();
            if (p.getId().equals(id)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public void displayAllProducts() {
        for (Product p : products) {
            System.out.printf("ID: %s | Name: %s | Base Price: Rs. %.2f | Final Price: Rs. %.2f%n",
                    p.getId(), p.getName(), p.getBasePrice(), p.calPrice());
        }
    }

    public double totalInventoryValue() {
        double total = 0.0;
        for (Product p : products) {
            total += p.calPrice();
        }
        return total;
    }

    public void run() {
        // 1. Create and add the four products in the table; display all four and the count.
        System.out.println("--- Step 1: Adding initial products ---");
        addProduct(new ElectronicProduct("E101", "Laptop", 100000.0, 2000.0));
        addProduct(new ElectronicProduct("E102", "Mouse", 2000.0, 100.0));
        addProduct(new GroceryProduct("G201", "Rice", 3000.0, 5.0));
        addProduct(new GroceryProduct("G202", "Milk", 400.0, 5.0));
        displayAllProducts();
        System.out.println("Product count: " + products.size());

        // 2. Find product G201 and display its details.
        System.out.println("\n--- Step 2: Finding G201 ---");
        Product foundG201 = findProduct("G201");
        if (foundG201 != null) {
            System.out.printf("Found -> ID: %s | Name: %s | Base Price: Rs. %.2f | Final Price: Rs. %.2f%n",
                    foundG201.getId(), foundG201.getName(), foundG201.getBasePrice(), foundG201.calPrice());
        } else {
            System.out.println("Product G201 not found.");
        }

        // 3. Update G201 base price from Rs. 3,000 to Rs. 3,500; show the new calculated price.
        System.out.println("\n--- Step 3: Updating G201 base price to Rs. 3,500 ---");
        if (updateProduct("G201", 3500.0)) {
            Product updatedG201 = findProduct("G201");
            System.out.printf("Updated G201 -> Base Price: Rs. %.2f | New Calculated Price: Rs. %.2f%n",
                    updatedG201.getBasePrice(), updatedG201.calPrice());
        } else {
            System.out.println("Failed to update G201.");
        }

        // 4. Delete E102; display the revised inventory.
        System.out.println("\n--- Step 4: Deleting E102 ---");
        if (deleteProduct("E102")) {
            System.out.println("Deleted E102.");
        } else {
            System.out.println("Could not delete E102.");
        }
        displayAllProducts();

        // 5. Attempt to add another product with ID E101; reject the duplicate.
        System.out.println("\n--- Step 5: Attempting duplicate ID E101 ---");
        boolean addedDuplicate = addProduct(new ElectronicProduct("E101", "Duplicate Laptop", 90000.0, 1500.0));
        if (!addedDuplicate) {
            System.out.println("Rejected duplicate product with ID E101.");
        }

        // 6. Attempt to delete X999; show a not-found message.
        System.out.println("\n--- Step 6: Attempting to delete X999 ---");
        if (!deleteProduct("X999")) {
            System.out.println("Product X999 not found; could not delete.");
        }

        // 7. Print the product count and inventory total after the preceding steps.
        System.out.println("\n--- Step 7: Inventory summary ---");
        System.out.println("Remaining product count: " + products.size());
        System.out.printf("Total inventory value: Rs. %.2f%n", totalInventoryValue());

        // 8. Separately create E103 with 3-arg constructor and demonstrate calculated price (do not add to inventory).
        System.out.println("\n--- Step 8: Demonstrating 3-arg constructor chaining (E103) ---");
        Product e103 = new ElectronicProduct("E103", "USB Cable", 800.0);
        System.out.printf("Standalone -> ID: %s | Name: %s | Base Price: Rs. %.2f | Calculated Price: Rs. %.2f%n",
                e103.getId(), e103.getName(), e103.getBasePrice(), e103.calPrice());
    }
}