package com.timeless.menglavol.design.pattern.observer.observer_normal.client;

import com.timeless.menglavol.design.pattern.observer.observer_normal.observer.ConcreteObserver;
import com.timeless.menglavol.design.pattern.observer.observer_normal.subject.ConcreteSubject;

/**
 * @ClassName: Client
 * @Description: 客户端类
 * @Author: timeless
 * @Date: 2024/9/4
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        ConcreteObserver zhangsan = new ConcreteObserver("zhangsan", concreteSubject);
        ConcreteObserver lisi = new ConcreteObserver("lisi", concreteSubject);
        ConcreteObserver wangwu = new ConcreteObserver("wangwu", concreteSubject);

        concreteSubject.attach(zhangsan);
        concreteSubject.attach(lisi);
        concreteSubject.attach(wangwu);

        /*concreteSubject.setState("doing");

        concreteSubject.notifyObservers();*/
        concreteSubject.setStateAndNotifyObservers("doing");
    }
}
