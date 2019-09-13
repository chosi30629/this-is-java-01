package _08_nested_class_interface.class_access_example.exam03;

public class OutterExample {

    public static void main(String[] args) {
        Outter outter = new Outter();
        Outter.Nested nested = outter.new Nested();
        nested.print();
    }

}

/*
    결과
        Nested-field
        Nested-method
        Outter-field
        Outter-method
 */