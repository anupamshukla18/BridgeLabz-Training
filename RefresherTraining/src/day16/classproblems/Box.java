package day16.classproblems;

interface Storage<T> {
    void store(T value);
    T retrieve();
}

public class Box<T> implements Storage<T> {
    T value;

    public void store(T value) {
        this.value = value;
    }

    public T retrieve() {
        return value;
    }

    public static void main(String[] args) {
        Storage<Integer> b = new Box<>();
        b.store(5);
        System.out.println(b.retrieve());
    }
}
