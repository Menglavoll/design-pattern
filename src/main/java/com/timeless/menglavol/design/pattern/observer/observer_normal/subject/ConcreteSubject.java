package com.timeless.menglavol.design.pattern.observer.observer_normal.subject;

/**
 * @ClassName: ConcreteSubject
 * @Description: 具体的主题类
 * @Author: timeless
 * @Date: 2024/9/4
 */
public class ConcreteSubject extends AbstractSubject {

    // 具体的主题状态
    private String state;

    public String getState() {
        return state;
    }

    // 更新主题的状态 但不通知观察者
    public void setState(String state) {
        this.state = state;
    }

    // 更新当前主题的状态
    // 并将状态变更的信息通知所有观察者
    public void setStateAndNotifyObservers(String state) {
        this.state = state;
        notifyObservers();
    }
}
