
public class Main {
    public static void main(String[] args) {

        // Create one customer
        Customer customer = new Customer(
            "101", "Ali", "Lahore, Pakistan"
        );

        // Create two delivery riders
        DeliveryRider rider1 = new DeliveryRider(
            "201", "Ahmed", "LEA-1234"
        );

        DeliveryRider rider2 = new DeliveryRider(
            "202", "Usman", "LEB-5678"
        );

        // Create two orders with their own bills
        FoodOrder order1 = new FoodOrder(
            "301", customer, "401", 1500.0
        );

        FoodOrder order2 = new FoodOrder(
            "302", customer, "402", 2200.0
        );

        // Create the delivery desk
        DeliveryDesk desk = new DeliveryDesk(
            "Main Delivery Desk"
        );

        // Register existing orders and riders
        desk.addOrder(order1);
        desk.addOrder(order2);

        desk.addRider(rider1);
        desk.addRider(rider2);

        // Display complete information
        desk.displayDesk();
    }
}
