public class GroceryProduct extends Product {
    private double discountPercent;

    public GroceryProduct(String id, String name, double basePrice, double discountPercent) {
        super(id, name, basePrice);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calPrice() {
        return getBasePrice() * (1.0 - discountPercent / 100.0);
    }
}