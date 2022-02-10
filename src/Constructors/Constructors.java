package Constructors;

public class Constructors {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Dog bravo = new Dog("Bravo");
        Dog newDog = new Dog(5);
        Dog jackie = new Dog("Jackie", 3);

        Cat chinki = new Cat("Chinki");
        chinki.greetUser("Minki");
        System.out.println("Hello " + chinki.name);
    }
}
