package com.timeless.menglavol.design.pattern.observer.observer_delegation.subject;

import com.timeless.menglavol.design.pattern.observer.observer_delegation.delegation.IDelegation;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: AbstractSubject
 * @Description: 抽象的主题类
 * @Author: timeless
 * @Date: 2024/9/4
 */
public abstract class AbstractSubject {

    // 设置为常量用于存储当前主题的观察者的委托对象列表
    private static final List<IDelegation> OBSERVERS = new ArrayList<>();

    // 向观察者的委托对象列表中添加观察者的委托对象
    public void attach(IDelegation observer) {
        OBSERVERS.add(observer);
    }

    // 从观察者的委托对象列表中移除观察者的委托对象
    public void detach(IDelegation observer) {
        OBSERVERS.remove(observer);
    }

    // 主题状态变更 通知所有观察者
    public void notifyObservers() {
        for (IDelegation observer : OBSERVERS) {
            // 通过调用委托对象的方法 通知观察者
            observer.action();
        }
    }
}
