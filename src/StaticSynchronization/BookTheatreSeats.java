package StaticSynchronization;

public class BookTheatreSeats {
    private int total_seats = 10;

    public void bookSeats(int seats) {
        if (seats <= total_seats) {
            System.out.println(seats + " are booked successfully");
            total_seats = total_seats - seats;
            System.out.println("Seats left: " + total_seats);
        } else {
            System.out.println("Sorry all the seats are booked");
            System.out.println("Seats left: " + total_seats);
        }
    }
}
