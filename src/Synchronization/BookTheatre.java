package Synchronization;

public class BookTheatre {
    int total_seats = 10;

    void bookSeats(int seats) {
        synchronized (this) {
            if (seats <= total_seats) {
                System.out.println(seats + " seats are booked successfully!!!");
                total_seats = total_seats - seats;
                System.out.println("Seats left: " + total_seats);
            } else {
                System.out.println("Sorry all the seats are booked");
                System.out.println("Seats left: " + total_seats);
            }
        }
    }
}
