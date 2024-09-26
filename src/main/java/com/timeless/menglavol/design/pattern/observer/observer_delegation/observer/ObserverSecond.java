package com.timeless.menglavol.design.pattern.observer.observer_delegation.observer;

import com.timeless.menglavol.design.pattern.observer.observer_delegation.subject.ConcreteSubject;

/**
 * @ClassName: ObserverSecond
 * @Description: 第二个观察者
 * @Author: timeless
 * @Date: 2024/9/6
 */
public class ObserverSecond {

    // 声明当前观察者的名称
    private String name;

    // 当前观察者关注的主题
    private ConcreteSubject subject;

    // 当前观察者的状态 可能会根据主题的变化而变化
    private String observerState;

    // 观察者的构造方法
    public ObserverSecond(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    // 子类通过实现该方法
    // 来根据主题的状态变化而作出相关的操作
    public void updateSecond() {
        this.observerState = subject.getState();
        System.out.println("观察者：" + name + " 的得到Subject的最新状态是：" + observerState);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }

    public String getObserverState() {
        return observerState;
    }

    public void setObserverState(String observerState) {
        this.observerState = observerState;
    }
}
