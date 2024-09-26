package com.timeless.menglavol.design.pattern.mediator.colleague;

import com.timeless.menglavol.design.pattern.mediator.mediator.AbstractMediator;

/**
 * @ClassName: AbstractColleague
 * @Description: 抽象的同事类
 * @Author: timeless
 * @Date: 2024/9/15
 */
public abstract class AbstractColleague {

    // 声明一个子类可以使用的中介者对象
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    // 向某个同事发送消息
    public abstract void send(String message);

    public abstract void receive(String message);
}
