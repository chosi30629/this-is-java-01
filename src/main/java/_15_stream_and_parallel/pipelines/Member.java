package _15_stream_and_parallel.pipelines;

public class Member {
    public static final int MAIL = 0;
    public static final int FEMAIL = 1;

    private String name;
    private int gender;
    private int age;


    public Member(String name, int gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

}
