package com.timeless.menglavol.design.pattern.memento.originator;

import com.timeless.menglavol.design.pattern.memento.memento.Memento;

/**
 * @ClassName: Originator
 * @Description: 备忘录发起类
 * @Author: timeless
 * @Date: 2024/9/12
 */
public class Originator {

    private String state;

    // 创建备忘录方法
    public Memento createMemento() {
        return new Memento(state);
    }

    // 恢复备忘录方法
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    // 当前状态展示
    public void show(){
        System.out.println("The originator's state is :" + state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
