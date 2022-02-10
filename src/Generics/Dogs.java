package Generics;

public class Dogs extends Animal {
    private final String bark;

    public Dogs(String type, String name, String owner, Gender gender, String bark) {
        super(type, name, owner, gender);
        this.bark = bark;
    }

    public void showDetails() {
        if (getGender().equals(Gender.MALE)) {
            System.out.println(getName() + " is a " + getType() + " and he " + bark + " at " + getOwner());
        } else {
            System.out.println(getName() + " is a " + getType() + " and she " + bark + " at " + getOwner());
        }
    }

    public String getBark() {
        return bark;
    }
}
