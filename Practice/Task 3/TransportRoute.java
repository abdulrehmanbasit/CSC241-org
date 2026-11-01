public class TransportRoute{
	private String routeName;
	private String destination;
	private  SchoolVehicle vehicle;
	private Driver[] drivers;

	private int countDriver;


	public TransportRoute(String routeName,String destination){
		this.routeName=routeName;
		this.destination=destination;	


		drivers= new Driver[2];
		countDriver=0;
	}
	public 	void setVehicle(SchoolVehicle vehicle){
	this.vehicle = vehicle;
	}

	public void addDriver(Driver driver){

		if(countDriver<2){
		drivers[countDriver]=driver;
		countDriver++;

	}
		else{
		System.out.println("MAX 2 Allowed");
		}
	}
	public void displayRoute(){
		System.out.println("Route NAme:" +routeName);
		System.out.println("Destination" +destination);
		System.out.println("Vehicle :" );
		if(vehicle !=null){
		vehicle.displayInfo();
			} else{
				System.out.println("No vehicle assigned:");
					}
		System.out.println("DRIVER");
		for(int i=0;i<countDriver;i++){

			drivers[i].displayDrivers();
		System.out.println();

			}

		}
	}
