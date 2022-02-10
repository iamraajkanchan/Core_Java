package Generics;

import java.io.Serializable;

// This is an example of Bounded Generic
// In this type of declaration you make sure to define an extending class first and then define the implementing the class.
// The other way around will throw you a compile time error
public class CompoundBoundedGeneric<T extends Animal & Serializable> {
    T animal;

    public CompoundBoundedGeneric(T animal) {
        this.animal = animal;
    }

    public void showDetails() {
        animal.showName();
    }
}
