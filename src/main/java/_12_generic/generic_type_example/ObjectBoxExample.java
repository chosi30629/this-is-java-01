package _12_generic.generic_type_example;

public class ObjectBoxExample {

    public static void main(String[] args) {
        ObjectBox objectBox = new ObjectBox();
        objectBox.setObject("홍길동");
        String name = (String) objectBox.getObject();

        objectBox.setObject(new ObjectApple());
        ObjectApple apple = (ObjectApple) objectBox.getObject();
    }

}
