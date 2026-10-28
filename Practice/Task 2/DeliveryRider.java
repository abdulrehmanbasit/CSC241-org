public class DeliveryRider extends Person{
	private	String vehicleNumber;

	public DeliveryRider(String personId,String name,String vehicleNumber){
		super(personId,name);

		this.vehicleNumber=vehicleNumber;



}
	@Override
	public void displayinfo(){
		System.out.println("Rider Id:"+ personId);
		System.out.println("Name:"+ name);
		System.out.println("Vehicle Number:"+vehicleNumber);


}









}