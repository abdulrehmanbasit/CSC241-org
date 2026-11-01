public class Main {
    public static void main(String[] args) {

        // Create two Phone objects and one Laptop object.
        Phone p1 = new Phone(
            101, "Samsung", 150000, 12, "03001234567", 256
        );

        Phone p2 = new Phone(
            102, "Apple", 250000, 12, "03007654321", 512
        );

        Laptop l1 = new Laptop(
            103, "HP", 180000, 24, "03001112223", 16
        );

        // Create two SalesAssistant objects.
        SalesAssistant s1 = new SalesAssistant(1, "Ali");
        SalesAssistant s2 = new SalesAssistant(2, "Ahmed");

        // Create the store branch.
        StoreBranch branch = new StoreBranch("Lahore Branch");

        // Add existing products.
        branch.addProduct(p1);
        branch.addProduct(p2);
        branch.addProduct(l1);

        // Add existing sales assistants.
        branch.addAssistant(s1);
        branch.addAssistant(s2);

        // Display inventory and staff.
        branch.displayInventory();
        branch.displayAssistants();

        // Attempt to add a fifth product.
        System.out.println("\n=== Testing Full Capacity ===");

        Phone p3 = new Phone(
            104, "Xiaomi", 90000, 12, "03009998877", 128
        );

        Phone p4 = new Phone(
            105, "Oppo", 80000, 12, "03005556666", 256
        );

        branch.addProduct(p3);
        branch.addProduct(p4);
    }
}