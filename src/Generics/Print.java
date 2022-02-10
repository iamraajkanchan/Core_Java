package Generics;

public class Print<T> {
    private final T value;

    public Print(T value) {
        this.value = value;
    }

    public void print() {
        System.out.println(value);
    }
}
