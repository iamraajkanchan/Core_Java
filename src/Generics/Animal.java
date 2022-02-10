package Generics;

public class Animal {

    private final String type;
    private final String name;
    private final String owner;
    private final Gender gender;

    public Animal(String type, String name, String owner, Gender gender) {
        this.type = type;
        this.name = name;
        this.owner = owner;
        this.gender = gender;
    }

    public void showName() {
        System.out.println("Hello " + name + ", welcome to the world of animal kingdom.");
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public Gender getGender() {
        return gender;
    }
}
