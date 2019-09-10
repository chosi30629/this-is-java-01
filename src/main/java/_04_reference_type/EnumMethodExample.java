package _04_reference_type;

public class EnumMethodExample {

    public static void main(String[] args) {
        Week today = Week.TUESDAY;
        String name = today.name();
        System.out.println(name);
//        System.out.println(today == name);  당연히 컴파일 에러
        System.out.println(today.equals(name));
        System.out.println(today.toString().equals(name));
        System.out.println(today.toString() == name);

        int ordinal = today.ordinal();
        System.out.println(ordinal);

        Week day1 = Week.MONDAY;
        Week day2 = Week.WEDNESDAY;
        int result1 = day1.compareTo(day2);
        int result2 = day2.compareTo(day1);
        System.out.println(result1);
        System.out.println(result2);

        if (args.length == 1) {
            String strDay = args[0];
            Week weekDay = Week.valueOf(strDay);
            if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
                System.out.println("주말");
            } else {
                System.out.println("평일");
            }
        }

        Week[] days = Week.values();
        for (Week day : days) {
            System.out.println(day);
        }
    }

}

/*
    결과
        TUESDAY
        false
        true
        true
        1
        -2
        2
        평일
        MONDAY
        TUESDAY
        WEDNESDAY
        THURSDAY
        FRIDAY
        SATURDAY
        SUNDAY
 */