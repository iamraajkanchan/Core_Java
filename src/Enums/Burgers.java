package Enums;

public enum Burgers {
    CHICKEN_BURGER(3, 15.10),
    VEG_BURGER(5, 12.25),
    EGG_BURGER(4, 13.50),
    KING_BURGER(4, 20.25);

    final int rating;
    final double price;

    Burgers(int rating, double price) {
        this.rating = rating;
        this.price = price;
    }
}
