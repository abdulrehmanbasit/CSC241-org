public class Bus {
    private String busNumber;
    private Seat[][] seats;

    public Bus() {
       	 this("DEFAULT", 2);
    }

    public Bus(String busNumber, int rows) {
        this.busNumber = busNumber;
        seats = new Seat[rows][4];

        int seatNumber = 1;
        	for (int row = 0; row < seats.length; row++) {
        	    for (int col = 0; col < seats[row].length; col++) {
                	seats[row][col] = new Seat(seatNumber);
                	seatNumber++;
            }
        }
    }

    public void displaySeats() {
        for (int row = 0; row < seats.length; row++) {
            System.out.print("Row " + (row + 1) + ": ");

            for (int col = 0; col < seats[row].length; col++) {
                Seat seat = seats[row][col];
                String status = seat.isReserved() ? "X" : "O";
                System.out.printf("%02d:%s", seat.getSeatNumber(), status);

                if (col == 1) {
                    System.out.print(" || ");
                } else if (col < seats[row].length - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public void reserveSeat(int seatNumber) {
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                Seat seat = seats[row][col];

                if (seat.getSeatNumber() == seatNumber) {
                    if (seat.reserve()) {
                        System.out.println("Reserving Seat " + seatNumber + ": Successful");
                    } else {
                        System.out.println("Reserving Seat " + seatNumber + ": Already Reserved");
                    }
                    return;
                }
            }
        }

        System.out.println("Reserving Seat " + seatNumber + ": Invalid Seat Number");
    }

    public int countAvailableSeats() {
        int available = 0;

        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                if (!seats[row][col].isReserved()) {
                    available++;
                }
            }
        }

        return available;
    }
}
