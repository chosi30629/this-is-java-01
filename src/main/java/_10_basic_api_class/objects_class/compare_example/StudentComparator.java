package _10_basic_api_class.objects_class.compare_example;

import java.util.Comparator;

public class StudentComparator implements Comparator<CompareExample.Student> {

    @Override
    public int compare(CompareExample.Student o1, CompareExample.Student o2) {
        if (o1.sno < o2.sno) {
            return - 1;
        } else if (o1.sno == o2.sno) {
            return 0;
        } else {
            return 1;
        }
    }

}
