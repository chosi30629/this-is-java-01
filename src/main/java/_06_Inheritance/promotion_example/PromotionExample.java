package _06_Inheritance.promotion_example;

public class PromotionExample {

    public static void main(String[] args) {
        PromotionChild promotionChild = new PromotionChild();

        PromotionParent promotionParent = promotionChild;

        promotionParent.method1();
        promotionParent.method2();  // 재정의 된 메소드가 호출됨
//        promotionParent.method3();    호출 불가능

        promotionChild.method3();
    }

}

/*
    자동 타입 변환이 되면 부모 객체의 멤버만 사용 가능. 단, 자식객체에서 재정의 메소드가 있다면 자식 메소드 호출

    결과
        Parent-method1()
        Child-method2()
        Child-method3()
 */