package Synchronization;

public class MovieBookApp extends Thread {
    private static BookTheatre bookTheatre;
    private int seats;

    @Override
    public void run() {
        bookTheatre.bookSeats(seats);
    }

    public static void main(String[] args) {
        bookTheatre = new BookTheatre();

        /*Object for Deepak*/
        MovieBookApp deepak = new MovieBookApp();
        deepak.seats = 7;
        deepak.start();

        /*Object for Amit*/
        MovieBookApp amit = new MovieBookApp();
        amit.seats = 8;
        amit.start();

    }
}
