package Generics;

import Constructors.Cat;

import java.util.ArrayList;

public class GenericsDemo {
    public static void main(String[] args) {

        // Class to print an Integer
        IntegerPrint integerPrint = new IntegerPrint(2);
        integerPrint.print();

        // Class to print a Double
        DoublePrint doublePrint = new DoublePrint(23.0);
        doublePrint.print();

        // Class to print a String
        StringPrint stringPrint = new StringPrint("Chinki");
        stringPrint.print();

        // Just to print a value of different type you got to write three different classes. To avoid writing redundant codes you can use Generics.
        // Generic class to print all types of value.
        Print<Integer> printInteger = new Print<>(7);
        printInteger.print();

        Print<Double> printDouble = new Print<>(23.0);
        printDouble.print();

        Print<Character> printCharacter = new Print<>('R');
        printCharacter.print();

        Print<String> printString = new Print<>("Minki");
        printString.print();

        ArrayList<Cats> listOfCats = new ArrayList<>();
        listOfCats.add(new Cats("Cat", "Chinki", "Raaj Kanchan", Gender.MALE, "Meow... Meow...!!!"));
        listOfCats.add(new Cats("Cat", "Minki", "Raaj Kanchan", Gender.FEMALE, "Meow...!!!"));
        listOfCats.get(0).showDetails();
        listOfCats.get(1).showDetails();
        // listOfCats.add(new Dogs("Dog","Bruno","Nikunj Sule","Bow... Bow... Bow...!!!")); // You are not allowed to add an object of a Dog in a list of cats.

        ArrayList<Object> listOfObjects = new ArrayList<>();
        listOfObjects.add(new Cats("Cat", "Prince", "Raaj Kanchan", Gender.MALE, "Meow.....!!!"));
        listOfObjects.add(new Dogs("Dog", "Bruno", "Nikunj Sule", Gender.MALE, "Bow... Bow... Bow...!!!"));

        // Cats newCat1 = listOfObjects.get(0); // It throws a compile time error unless you cast it to Cats like below
        Cats newCat = (Cats) listOfObjects.get(0);
        newCat.showDetails();
        // Dogs newDog1 = (Dogs) listOfObjects.get(0);
        // It throws a runtime error because we have stored an object of a Cat in the first element of listOfObjects variable. This is called type-safety.
        Dogs newDog = (Dogs) listOfObjects.get(1);
        newDog.showDetails();

        // Generic class for a cat
        BoundedGeneric<Cats> tom = new BoundedGeneric<>(new Cats("Cat", "Tom", "Raaj Kanchan", Gender.MALE, "Meow...!!! Meow...!!!"));
        tom.showDetails();
        // Generic class for a dog
        BoundedGeneric<Dogs> tofu = new BoundedGeneric<>(new Dogs("Dog", "Tofu", "Elizabeth", Gender.FEMALE, "Bow!!! Bow!!! Bow!!"));
        tofu.showDetails();
    }
}
