package Recursion;

public class RecursionDemo {
    public static void main(String[] args) {
        // sayHi();
        sayHello(3);
    }

    // The reason why we marked this method as static because we want to call this method in a static method that is main()
    private static void sayHi() {
        System.out.println("Hi!");
        sayHi(); // This recursion will throw StackOverflowError
    }

    private static void sayHello(int count) {
        System.out.println("Hello");
        if (count <= -1) {
            return;
        }
        sayHello(count - 1);
    }
}
