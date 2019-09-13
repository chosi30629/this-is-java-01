package _08_nested_class_interface.anonymous_method_example;

public class Anonymous {
    private int field;


    /*
        로컬 클래스(class_access_example 의 local_class_example 참조)와
        익명 클래스와의 차이점은 클래스 이름의 존재 여부만 다를 뿐 동작 방식은 동일하다.
        익명 객체 내부에서 메소드의 매개 변수나 로컬 변수를 사용할 경우, 이 변수들은 final 특성을 가져야 한다.
        자바 7 이전까지는 반드시 final 키워드로 이 변수들을 선언해야 했지만,
        자바 8 이후부터는 final 키워드 없이 선언해도 좋다.
        final 선언을 하지 않아도 여전히 값을 수정할 수 없는 final 특성을 갖기 때문이다.
        컴파일 시 final 키워드가 있다면 메소드 내부에 지역 변수로 복사되지만, final 키워드가 없다면 익명 클래스의 필드로 복사된다.
        우리는 익명 클래스의 내부 복사 위치에 신경 쓸 필요 없이 익명 객체에서 사용된 매개 변수와 로컬 변수는 모두 final 특성을
        갖는다는 것만 알면 된다.
     */
    public void method(final int arg1, int arg2) {
        final int var1 = 0;
        int var2 = 0;

        field = 10;

//        arg1 = 20;  X
//        arg2 = 20;  X 여기서 컴파일 에러는 나지 않지만 밑의 익명 객체의 sum() 에서 컴파일 에러

//        var1 = 30;  X
//        var2 = 30;  X 여기서 컴파일 에러는 나지 않지만 밑의 익명 객체의 sum() 에서 컴파일 에러

        Calculatable calculatable = new Calculatable() {
            @Override
            public int sum() {
                int result = field + arg1 + arg2 + var1 + var2;
                return result;
            }
        };

        System.out.println(calculatable.sum());
    }

}
