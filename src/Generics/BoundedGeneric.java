package Generics;

// This is an example of Bounded Generic
public class BoundedGeneric<T extends Animal> {
    T animal;

    public BoundedGeneric(T animal) {
        this.animal = animal;
    }

    public void showDetails() {
        animal.showName();
    }
}
