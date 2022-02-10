package Enums;

public class Enumerator {
    public static void main(String[] args) {
        DaysOfTheWeek day = DaysOfTheWeek.FRIDAY;
        if (day == DaysOfTheWeek.FRIDAY) {
            System.out.println("Yay! Tomorrow is Saturday.");
        }
        for (DaysOfTheWeek myDay : DaysOfTheWeek.values()) {
            System.out.println(myDay);
        }
        for (Burgers burger : Burgers.values()) {
            System.out.println("Burger Name: " + burger + ", Rating: " + burger.rating + ", Price: " + burger.price);
        }

    }
}
