package com.ekhu94;

public abstract class UIControl {
    private boolean enabled = false;

    public abstract void render();

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
