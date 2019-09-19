package _15_stream_and_parallel.sorted;

// Comparable 을 구현한 요소에서만 sorted() 메소드 호출 가능
public class Student implements Comparable<Student>{
    private String name;
    private int score;


    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }


    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(score, o.score);
    }

}
