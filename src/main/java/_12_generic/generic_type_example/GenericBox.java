package _12_generic.generic_type_example;

public class GenericBox<T> {
    private T t;


    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

}
