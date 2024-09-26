package com.timeless.menglavol.design.pattern.observer.observer_delegation.client;

import com.timeless.menglavol.design.pattern.observer.observer_delegation.delegation.DelegationObserverFirst;
import com.timeless.menglavol.design.pattern.observer.observer_delegation.delegation.DelegationObserverSecond;
import com.timeless.menglavol.design.pattern.observer.observer_delegation.delegation.IDelegation;
import com.timeless.menglavol.design.pattern.observer.observer_delegation.observer.ObserverFirst;
import com.timeless.menglavol.design.pattern.observer.observer_delegation.observer.ObserverSecond;
import com.timeless.menglavol.design.pattern.observer.observer_delegation.subject.ConcreteSubject;

/**
 * @ClassName: Client
 * @Description: 客户端类
 * @Author: timeless
 * @Date: 2024/9/4
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        ObserverFirst zhangsan = new ObserverFirst("zhangsan", concreteSubject);
        ObserverSecond lisi = new ObserverSecond("lisi", concreteSubject);

        IDelegation firstDelegation = new DelegationObserverFirst(zhangsan);
        IDelegation secondDelegation = new DelegationObserverSecond(lisi);

        concreteSubject.attach(firstDelegation);
        concreteSubject.attach(secondDelegation);

        /*concreteSubject.setState("doing");

        concreteSubject.notifyObservers();*/
        concreteSubject.setStateAndNotifyObservers("doing");
    }
}
