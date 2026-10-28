public class Laptop extends ElectronicProduct{
	private int ramGB;
	
	public Laptop(String name, double price, Date manufacturingDate, int months, int ramGB){
	super(name,price,manufacturingDate,months);

	this.ramGB=ramGB;
	}
	public void displayDetails(){
	super.displayDetails();
	System.out.println("Ram:"+ramGB);
	}	
		

}