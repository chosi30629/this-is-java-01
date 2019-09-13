package _08_nested_class_interface.interface_basic_example;

public class CallListener implements Button.OnClickListener {

    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }

}
