package _08_nested_class_interface.class_access_example.local_class_exmaple;

// 로컬 클래스를 사용하는 바깥 클래스의 매개 변수와 로컬 변수의 값은 바뀔 수 없다.
public class Outter {
    // 자바 7 이전
    public void method1(final int arg) {
        final int localVariable = 1;
//        arg = 100;              X     final 이기 때문에 컴파일 에러
//        localVariable = 100;    X

        class Inner {
            int result = arg + localVariable;
        }
    }


    // 자바 8 이후
    public void method2(int arg) {
        int localVariable = 1;
//        arg = 100;                final 이 아니기 때문에 여기서 컴파일 에러는 나지 않지만 method() 의 + 부분에서 에러, 결론은 바꿀 수 없음
//        localVariable = 100;

        class Inner {
            public void method() {
                int result = arg + localVariable;
            }
        }
    }

}
