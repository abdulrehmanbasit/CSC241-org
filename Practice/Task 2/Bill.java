public class Bill{
	private String billNumber;
	private double totalAmount;

	public Bill(String billNumber,double totalAmount){

	this.billNumber=billNumber;
	this.totalAmount=totalAmount;
	}

	public void displayBill(){
		System.out.println("Bill Number:"+billNumber);
		System.out.println("Total;"+totalAmount);

		}

}