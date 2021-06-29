package com.ekhu94;

public class TextBox extends UIControl {
    private String text = "";

    public TextBox(boolean enabled) {
        super(enabled);
        System.out.println("TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }
}
