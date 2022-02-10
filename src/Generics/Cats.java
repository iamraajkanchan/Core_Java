package Generics;

public class Cats extends Animal {
    private final String meow;

    public Cats(String type, String name, String owner, Gender gender, String meow) {
        super(type, name, owner, gender);
        this.meow = meow;
    }

    public void showDetails() {
        if (getGender().equals(Gender.MALE)) {
            System.out.println(getName() + " is a " + getType() + " and he " + meow + " at " + getOwner());
        } else {
            System.out.println(getName() + " is a " + getType() + " and she " + meow + " at " + getOwner());
        }

    }

    public String getMeow() {
        return meow;
    }
}
