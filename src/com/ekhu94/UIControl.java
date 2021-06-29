package com.ekhu94;

public class UIControl {
    private boolean enabled;

    public UIControl(boolean enabled) {
        this.enabled = enabled;
        System.out.println("UI Control");
    }

    public void enable() {
        this.enabled = true;
    }

    public void disable() {
        this.enabled = false;
    }

    public boolean isEnabled() {
        return this.enabled;
    }
}
