package Constructors;

public class Cat {
    public static final int NUMBER_OF_MONTHS_IN_A_YEAR = 12;
    public final int NUMBER_OF_DAYS_IN_A_WEEK = 7;
    public String name;

    public void greetUser(String name) {
        System.out.println("Hello " + name);
    }

    private Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }
}
