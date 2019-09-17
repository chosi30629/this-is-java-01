package _12_generic.extends_implements_example;

public interface Storage<T> {
    public void add(T item, int index);
    public T get(int index);
}
