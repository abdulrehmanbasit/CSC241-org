public class SchoolVehicle{
	private String vehicleId;	
	private String registrationNumber;
	private int seatingCapacity;

	private RegistrationCard card;
	
    public SchoolVehicle(String vehicleId, String registrationNumber,
                         int seatingCapacity, String ownerName,
                         int expiryYear){
	this.vehicleId=vehicleId;
	this.registrationNumber=registrationNumber;
	this.seatingCapacity=seatingCapacity;

	this.card=new RegistrationCard(ownerName,expiryYear);


}
	public void displayInfo(){
	System.out.println("Vehicle ID:"+vehicleId);
	System.out.println("Registration Number:"+registrationNumber);
	System.out.println("Seat Capacity:"+seatingCapacity);
	System.out.println("Card:");
	card.displayCard();

	
	

}








}