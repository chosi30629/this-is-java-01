package _10_basic_api_class.class_class;

public class ClassExample {

    public static void main(String[] args) {
        Car car = new Car();
        Class clazz1 = car.getClass();
        System.out.println(clazz1.getName());
        System.out.println(clazz1.getSimpleName());
        System.out.println(clazz1.getPackage().getName());
        System.out.println();

        try {
            Class clazz2 = Class.forName("_10_basic_api_class.class_class.Car");
            System.out.println(clazz2.getName());
            System.out.println(clazz2.getSimpleName());
            System.out.println(clazz2.getPackage().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

class Car {

}

/*
    결과
        _10_basic_api_class.class_class.Car
        Car
        _10_basic_api_class.class_class

        _10_basic_api_class.class_class.Car
        Car
        _10_basic_api_class.class_class
 */