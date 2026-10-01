public class Cart {
    private double total;

    	public void addItem(double price) {
        if (price > 0) total += price;
    	}
    	public double getTotal() {
	 return total;
	}
	public void addItem(double price, int quantity){
		if (price > 0 && quantity > 0)
		 total += price * quantity;
	}
}