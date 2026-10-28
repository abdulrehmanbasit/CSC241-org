public class ClothingProduct extends Product{

	private String size;
	
	public ClothingProduct(String name,double price, Date manufacturingDate,String size){
	super(name,price,manufacturingDate);
	
	this.size=size;
	}

	public void displayDetails(){
	super.displayDetails();
	System.out.println("Size:" +size);
	}
}