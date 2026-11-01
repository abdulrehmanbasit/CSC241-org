public class Bus extends SchoolVehicle{
	private int numberOfDoors;
	
	public Bus(String vehicleId,String registrationNumber,int seatingCapacity,String ownerName,int expiryYear, int numberOfDoors){
	super(vehicleId,registrationNumber,seatingCapacity,ownerName,expiryYear);
	this.numberOfDoors=numberOfDoors;
}
	@Override
	public void displayInfo(){
	super.displayInfo();
	System.out.println("Number of Doors:"+numberOfDoors);


	}

}