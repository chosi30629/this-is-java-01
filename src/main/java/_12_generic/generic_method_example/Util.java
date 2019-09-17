package _12_generic.generic_method_example;

import _12_generic.generic_type_example.GenericBox;

public class Util {

    public static <T> GenericBox<T> boxing(T t) {
        GenericBox<T> genericBox = new GenericBox<>();
        genericBox.set(t);
        return genericBox;
    }

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        boolean keyCompare = p1.getKey().equals(p2.getKey());
        boolean valueCompare = p1.getValue().equals(p2.getValue());
        return keyCompare && valueCompare;
    }

}
