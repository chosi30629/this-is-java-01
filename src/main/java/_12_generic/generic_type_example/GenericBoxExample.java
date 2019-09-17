package _12_generic.generic_type_example;

public class GenericBoxExample {

    public static void main(String[] args) {
        GenericBox<String> box1 = new GenericBox<>();
        box1.set("hello");
        String str = box1.get();

        GenericBox<Integer> box2 = new GenericBox<>();
        box2.set(6);
        int value = box2.get();
    }

}
