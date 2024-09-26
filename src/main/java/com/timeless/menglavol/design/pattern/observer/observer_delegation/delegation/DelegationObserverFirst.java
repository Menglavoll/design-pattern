package com.timeless.menglavol.design.pattern.observer.observer_delegation.delegation;

import com.timeless.menglavol.design.pattern.observer.observer_delegation.observer.ObserverFirst;

/**
 * @ClassName: DelegationObserverFirst
 * @Description: 第一个观察者的委托类
 * @Author: timeless
 * @Date: 2024/9/6
 */
public class DelegationObserverFirst implements IDelegation{

    private ObserverFirst observerFirst;

    public DelegationObserverFirst(ObserverFirst observerFirst) {
        this.observerFirst = observerFirst;
    }

    public ObserverFirst getObserverFirst() {
        return observerFirst;
    }

    public void setObserverFirst(ObserverFirst observerFirst) {
        this.observerFirst = observerFirst;
    }

    @Override
    public void action() {
        observerFirst.updateFirst();
    }
}
