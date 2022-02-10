package StaticSynchronization;

public class BookMovieApp extends Thread{
    private static BookTheatreSeats bookTheatre;
    int seats;
    @Override
    public void run() {
        bookTheatre.bookSeats(seats);
    }
    public static void main(String[] args) {
        bookTheatre = new BookTheatreSeats();

        /*Object of Deepak*/
        BookMovieApp deepak = new BookMovieApp();
        deepak.seats = 7;
        deepak.start();

        /*Object of Amit*/
        BookMovieApp amit = new BookMovieApp();
        amit.seats  =8;
        amit.start();
    }
}
