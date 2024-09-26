package com.timeless.menglavol.design.pattern.observer.observer_normal.subject;

import com.timeless.menglavol.design.pattern.observer.observer_normal.observer.AbstractObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: AbstractSubject
 * @Description: 抽象的主题类
 * @Author: timeless
 * @Date: 2024/9/4
 */
public abstract class AbstractSubject {

    // 设置为常量用于存储当前主题的观察者列表
    private static final List<AbstractObserver> OBSERVERS = new ArrayList<>();

    // 向观察者列表中添加观察者对象
    public void attach(AbstractObserver observer) {
        OBSERVERS.add(observer);
    }

    // 从观察者列表中移除观察者对象
    public void detach(AbstractObserver observer) {
        OBSERVERS.remove(observer);
    }

    // 主题状态变更 通知所有观察者
    public void notifyObservers() {
        for (AbstractObserver observer : OBSERVERS) {
            observer.update();
        }
    }
}
