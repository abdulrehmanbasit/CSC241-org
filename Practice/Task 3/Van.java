public class Van extends SchoolVehicle {
    private boolean airConditioned;

    public Van(String vehicleId, String registrationNumber,
               int seatingCapacity, String ownerName,
               int expiryYear, boolean airConditioned) {

        super(vehicleId, registrationNumber, seatingCapacity,ownerName, expiryYear);

        this.airConditioned = airConditioned;
    }

    @Override
    public void displayInfo() {
        System.out.println("Vehicle Type: Van");
        super.displayInfo();
        System.out.println("Air Conditioned: " + airConditioned);
    }
}