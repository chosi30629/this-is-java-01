package _10_basic_api_class.system_class;

public class GcExample {

    public static void main(String[] args) {
        Employee employee;

        employee = new Employee(1);
        employee = null;
        employee = new Employee(2);
        employee = new Employee(3);

        System.out.print("emp 가 최종적으로 참조하는 사원번호: ");
        System.out.println(employee.eno);
        System.gc();
    }

}

class Employee {
    public int eno;


    public Employee(int eno) {
        this.eno = eno;
        System.out.println("Employee(" + eno + ") 가 메모리에 생성됨");
    }

    public void finalize() {
        System.out.println("Employee(" + eno + ") 가 메소리에서 제거됨");
    }

}

/*
    결과
        Employee(1) 가 메모리에 생성됨
        Employee(2) 가 메모리에 생성됨
        Employee(3) 가 메모리에 생성됨
        emp 가 최종적으로 참조하는 사원번호: 3
        Employee(2) 가 메소리에서 제거됨
        Employee(1) 가 메소리에서 제거됨
 */