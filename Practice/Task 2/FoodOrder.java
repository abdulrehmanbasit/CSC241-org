public class FoodOrder{
	private String OrderId;
	private Customer customer;
	private Bill bill;

	public FoodOrder(String OrderId,Customer customer,String billNumber,double totalAmount){
	this.OrderId=OrderId;
	this.customer=customer;
 	this.bill = new Bill(billNumber, totalAmount);
	
}
	public void displayOrder(){
	System.out.println("Order ID:" +OrderId);
	System.out.println("Customer Details:");
	customer.displayinfo();
	System.out.println("Bill Details:");
	bill.displayBill();
}

}