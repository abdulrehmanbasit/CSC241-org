public class Main {
    public static void main(String[] args) {

        // Create vehicles
        Bus bus = new Bus(
            "101", "LEA-1234", 40,
            "School Administration", 2028, 2
        );

        Van van = new Van(
            "102", "LEB-5678", 15,
            "School Administration", 2027, true
        );

        // Create drivers
        Driver driver1 = new Driver("201", "Ali Ahmed");
        Driver driver2 = new Driver("202", "Usman Khan");

        // Create routes
        TransportRoute morningRoute =
            new TransportRoute("Morning Route", "School Campus");

        TransportRoute afternoonRoute =
            new TransportRoute("Afternoon Route", "School Campus");

        // Assign existing vehicles
        morningRoute.setVehicle(bus);
        afternoonRoute.setVehicle(van);

        // Assign existing drivers
        morningRoute.addDriver(driver1);
        afternoonRoute.addDriver(driver2);

        // Display both routes
        System.out.println("SCHOOL TRANSPORT MANAGEMENT SYSTEM");

        morningRoute.displayRoute();
        afternoonRoute.displayRoute();
    }
}