public class Phone extends Product{
	private int storageGB;


	public Phone(String productId,String brand,double price,int warrantyMonths,String supportPhone,int storageGB){
		super(productId,brand, price, warrantyMonths,supportPhone);
		this.storageGB=storageGB;

		}
	@Override
	public void displayInfo(){
	super.displayInfo();
	System.out.println("Storage:"+storageGB);
	}		


	
}