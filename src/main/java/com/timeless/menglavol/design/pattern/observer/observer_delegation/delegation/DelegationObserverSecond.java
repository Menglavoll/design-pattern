package com.timeless.menglavol.design.pattern.observer.observer_delegation.delegation;

import com.timeless.menglavol.design.pattern.observer.observer_delegation.observer.ObserverSecond;

/**
 * @ClassName: DelegationObserverSecond
 * @Description: 第二个观察者的委托类
 * @Author: timeless
 * @Date: 2024/9/6
 */
public class DelegationObserverSecond implements IDelegation{

    private ObserverSecond observerSecond;

    public DelegationObserverSecond(ObserverSecond observerSecond) {
        this.observerSecond = observerSecond;
    }

    public ObserverSecond getObserverSecond() {
        return observerSecond;
    }

    public void setObserverSecond(ObserverSecond observerSecond) {
        this.observerSecond = observerSecond;
    }

    @Override
    public void action() {
        observerSecond.updateSecond();
    }
}
