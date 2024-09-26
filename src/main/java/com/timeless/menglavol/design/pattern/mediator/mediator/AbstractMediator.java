package com.timeless.menglavol.design.pattern.mediator.mediator;

import com.timeless.menglavol.design.pattern.mediator.colleague.AbstractColleague;

/**
 * @ClassName: AbstractMediator
 * @Description: 抽象的中介者
 * @Author: timeless
 * @Date: 2024/9/16
 */
public abstract class AbstractMediator {

    // 向某个同事发送消息
    public abstract void send(String message, AbstractColleague colleague);
}
