package _10_basic_api_class.arrays_class;

public class Member implements Comparable<Member>{
    String name;


    public Member(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Member o) {
        return name.compareTo(o.name);
//        return -name.compareTo(o.name); 내림차순
    }

}
