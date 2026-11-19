public class ElectronicProduct extends Product {
    private double warrantyCharge;

    public ElectronicProduct(String id, String name, double basePrice, double warrantyCharge) {
        super(id, name, basePrice);
        this.warrantyCharge = warrantyCharge;
    }

    public ElectronicProduct(String id, String name, double basePrice) {
        this(id, name, basePrice, 0.0);
    }

    @Override
    public double calPrice() {
        return getBasePrice() * 1.10 + warrantyCharge;
    }
}