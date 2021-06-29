package com.ekhu94;

public class Main {

    public static void main(String[] args) {
	    var box1 = new TextBox(false);
	    show(box1);
    }

    public static void show(UIControl control) {
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("I am a text box!");
        }
        System.out.println(control.toString());
    }
}
