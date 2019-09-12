package _06_inheritance;

public class Student extends People {
    public int sudentNo;


    public Student(String name, String ssn, int sudentNo) {
        super(name, ssn);
        this.sudentNo = sudentNo;
    }

}
