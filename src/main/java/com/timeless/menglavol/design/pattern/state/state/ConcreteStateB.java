package com.timeless.menglavol.design.pattern.state.state;

import com.timeless.menglavol.design.pattern.state.work.Work;

/**
 * @ClassName: ConcreteStateB
 * @Description: 具体状态B类
 * @Author: timeless
 * @Date: 2024/9/12
 */
public class ConcreteStateB extends AbstractState {

    @Override
    protected void doSomething(Work work) {
        // 处理当前状态的行为
        System.out.println("current : B");
        work.setHour("13");
    }

    @Override
    protected void changeState(Work work) {
        // 变更work对象的状态
        work.setState(new ConcreteStateA());
    }
}
