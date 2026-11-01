public class Product{
	private String productId;
	private String brand;
	private double price;
	private WarrantyCard card;

	public Product(String productId,String brand,double price,int warrantyMonths,String supportPhone){
		this.productId=productId;
		this.brand=brand;
		this.price=price;
		card = new WarrantyCard(warrantyMonths,supportPhone);

	}	
	public void displayInfo(){
	System.out.println("Product Id:"+productId);
	System.out.println("Brand:"+brand);
	System.out.println("Price:"+price);
	card.displayWarrantyCard();


	}


}