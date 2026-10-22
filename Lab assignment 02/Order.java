public class Order {
    private int orderNo;
    private Customer customer;
    private OrderItem[] items;
    private int itemCount;

    public Order(int orderNo, Customer customer) {
        this(orderNo, customer, 5);
    }

    public Order(int orderNo, Customer customer, int capacity) {
        this.orderNo = orderNo;
        this.customer = customer;
        items = new OrderItem[capacity];
        itemCount = 0;
    }

    public void addItem(FoodItem item, int quantity) {
        if (item == null || quantity <= 0) {
            System.out.println("Invalid item or quantity.");
            return;
        }

        if (itemCount >= items.length) {
            System.out.println("Order is full.");
            return;
        }

        items[itemCount] = new OrderItem(item, quantity);
        itemCount++;

        System.out.println(item.getName() + " added successfully.");
    }

    public void findItem(int itemCode) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getItem().getItemCode() == itemCode) {
                System.out.println("\nItem found:");
                items[i].getItem().displayItem();
                System.out.println("Ordered Quantity: "
                                   + items[i].getQuantity());
                return;
            }
        }

        System.out.println("\nItem code " + itemCode
                           + " not found in this order.");
    }

    public double calculateTotal() {
        double total = 0;

        for (int i = 0; i < itemCount; i++) {
            total += items[i].getSubTotal();
        }

        return total;
    }

    public void displayOrder() {
        System.out.println("\n========== CAFETERIA ORDER ==========");
        System.out.println("Order Number: " + orderNo);

        customer.displayCustomer();

        System.out.println("\nOrdered Items:");

        for (int i = 0; i < itemCount; i++) {
            items[i].displayOrderItem();
        }

        System.out.println("--------------------------------------");
        System.out.printf("Total Bill: Rs. %.2f%n", calculateTotal());
        System.out.println("======================================");
    }
}