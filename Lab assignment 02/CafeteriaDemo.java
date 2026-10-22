public class CafeteriaDemo { 
    public static void main(String[] args) { 
        FoodItem burger = new FoodItem(101, "Chicken Burger", 650, 
                                       FoodCategory.MAIN_COURSE); 
        FoodItem drink = new FoodItem(102, "Soft Drink", 150, 
                                      FoodCategory.DRINK); 
        FoodItem fries = new FoodItem(103, "French Fries", 250, 
                                      FoodCategory.SNACK); 
        FoodItem dessert = new FoodItem(104, "Ice Cream", 300,FoodCategory.DESSERT); 
 
        Customer customer = new Customer(1, "Ali"); 
        Order order = new Order(5001, customer); 
         order.addItem(burger, 2);         order.addItem(drink, 1);         order.addItem(fries, 2); 
 
        order.displayOrder(); 
        System.out.println("\nSearching for item 102:");         order.findItem(102); 
        System.out.println("\nSearching for item 999:");         order.findItem(999); 
    } 
} 
