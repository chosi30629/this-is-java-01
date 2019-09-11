package _05_class;

public class MethodOverloading {

    double areaRectangle(double width) {
        return width * width;
    }

    double areaRectangle(double width, double height) {
        return width * height;
    }

}

/*
    메소드 오버로딩은 리턴타입은 무관하고 매개 변수의 타입, 개수, 순서가 달라야 한다.
    매개 변수의 타입, 개수, 순서가 같고 이름만 다르다고 해서 오버로딩이 되지 않는다.
 */
