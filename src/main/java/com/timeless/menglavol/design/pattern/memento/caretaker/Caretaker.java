package com.timeless.menglavol.design.pattern.memento.caretaker;

import com.timeless.menglavol.design.pattern.memento.memento.Memento;

/**
 * @ClassName: Caretaker
 * @Description: 备忘录管理类
 * @Author: timeless
 * @Date: 2024/9/12
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
