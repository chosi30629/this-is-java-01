package _10_basic_api_class.class_class;

public class NewInstanceExample {

    public static void main(String[] args) {
        try {
            Class clazz1 = Class.forName("_10_basic_api_class.class_class.SendAction");
            Class clazz2 = Class.forName("_10_basic_api_class.class_class.ReceiveAction");
            Action action1 = (Action) clazz1.newInstance();
            Action action2 = (Action) clazz2.newInstance();
            action1.execute();
            action2.execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}

/*
    결과
        데이터를 보냅니다.
        데이터를 받습니다.
 */