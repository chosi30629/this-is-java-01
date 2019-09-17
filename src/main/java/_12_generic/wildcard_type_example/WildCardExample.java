package _12_generic.wildcard_type_example;

import java.util.Arrays;

public class WildCardExample {

    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseStudent(Course<? extends Student> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseWorker(Course<? super Worker> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반인과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HighStudent("고등학생"));

        Course<Worker> workerCourse = new Course<>("직장인과정", 5);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<>("학생과정", 5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<>("고등학생 과정", 5);
        highStudentCourse.add(new HighStudent("고등학생"));

        // 모든 과정 등록 가능
        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);
        System.out.println();

        // 학생 과정만 등록
//        registerCourseStudent(personCourse);
//        registerCourseStudent(workerCourse);
        registerCourseStudent(studentCourse);
        registerCourseStudent(highStudentCourse);
        System.out.println();

        // 직장인과 일반인 과정만 등록
        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);
//        registerCourseWorker(studentCourse);
//        registerCourseWorker(highStudentCourse);
    }

}


class Person {
    public String type;

    public Person(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}

class Worker extends Person {

    public Worker(String type) {
        super(type);
    }
}

class Student extends Person {

    public Student(String type) {
        super(type);
    }
}

class HighStudent extends Student {

    public HighStudent(String type) {
        super(type);
    }

}

/*
    결과
        일반인과정 수강생: [일반인, 직장인, 학생, 고등학생, null]
        직장인과정 수강생: [직장인, null, null, null, null]
        학생과정 수강생: [학생, 고등학생, null, null, null]
        고등학생 과정 수강생: [고등학생, null, null, null, null]

        학생과정 수강생: [학생, 고등학생, null, null, null]
        고등학생 과정 수강생: [고등학생, null, null, null, null]

        일반인과정 수강생: [일반인, 직장인, 학생, 고등학생, null]
        직장인과정 수강생: [직장인, null, null, null, null]
 */