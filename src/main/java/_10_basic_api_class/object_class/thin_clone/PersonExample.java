package _10_basic_api_class.object_class.thin_clone;

public class PersonExample {

    public static void main(String[] args) {
        // 원본 객체 생성
        Person original = new Person("blue", "홍길동", "12345", 15, true);

        // 복제 객체를 얻은 후에 패스워드 변경
        Person cloned = original.getPerson();
        cloned.password = "67890";

        System.out.println("[복제 객체의 필드값]");
        System.out.println("id: " + cloned.id);
        System.out.println("name: " + cloned.name);
        System.out.println("password: " + cloned.password);
        System.out.println("age: " + cloned.age);
        System.out.println("adult: " + cloned.adult);

        System.out.println();

        System.out.println("[원본 객체의 필드값]");
        System.out.println("id: " + original.id);
        System.out.println("name: " + original.name);
        System.out.println("password: " + original.password);
        System.out.println("age: " + original.age);
        System.out.println("adult: " + original.adult);
    }

}

/*
    결과
        [복제 객체의 필드값]
        id: blue
        name: 홍길동
        password: 67890
        age: 15
        adult: true

        [원본 객체의 필드값]
        id: blue
        name: 홍길동
        password: 12345
        age: 15
        adult: true
 */