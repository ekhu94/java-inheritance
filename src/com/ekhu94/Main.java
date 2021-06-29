package com.ekhu94;

public class Main {

    public static void main(String[] args) {
	    var box1 = new TextBox();
	    show(box1);
	    renderUIs();
    }

    public static void renderUIs() {
        UIControl[] controls = { new TextBox(), new CheckBox() };
        for (UIControl control : controls) {
            control.render();
        }
    }

    public static void show(UIControl control) {
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("I am a text box!");
        }
        System.out.println(control.toString());
    }
}
