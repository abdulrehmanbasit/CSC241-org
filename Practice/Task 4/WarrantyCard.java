public class Warrantycard{
	private int warrantyMonths;
	private String supportPhone;
	
	public WarrantyCard(int warrantyMonths,String supportPhone){
		this.warrantyMonths=warrantyMonths;
		this.supportPhone=supportPhone;
		}
	public void displayWarrantyCard(){
		System.out.println("Warranty months:"+warrantyMonths);
		System.out.println("Support Phone:"+supportPhone);


	}



}