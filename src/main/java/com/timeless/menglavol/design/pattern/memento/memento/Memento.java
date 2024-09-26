package com.timeless.menglavol.design.pattern.memento.memento;

/**
 * @ClassName: Memento
 * @Description: 备忘录类
 * @Author: timeless
 * @Date: 2024/9/12
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
