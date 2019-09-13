package _08_nested_class_interface.interface_basic_example;

public class MessageListener implements Button.OnClickListener {

    @Override
    public void onClick() {
        System.out.println("메시지를 보냅니다.");
    }

}
