public class Laptop extends Product{
	private int ramGB;


	public Laptop(String productId,String brand,double price,int warrantyMonths,String supportPhone,int ramGB){
		super(productId,brand, price, warrantyMonths,supportPhone);
		this.ramGB=ramGB;

		}
	@Override
	public void displayInfo(){
	super.displayInfo();
	System.out.println("Ram:"+ramGB);
	}		


	
}