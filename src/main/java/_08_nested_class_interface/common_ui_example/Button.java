package _08_nested_class_interface.common_ui_example;

public class Button {
    OnClickListener listener;


    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
    }

    interface OnClickListener {
        void onClick();
    }

}
