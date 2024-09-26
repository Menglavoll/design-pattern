package com.timeless.menglavol.design.pattern.state.state;

import com.timeless.menglavol.design.pattern.state.work.Work;

/**
 * @ClassName: ConcreteStateA
 * @Description: 具体状态A类
 * @Author: timeless
 * @Date: 2024/9/12
 */
public class ConcreteStateA extends AbstractState {

    @Override
    protected void doSomething(Work work) {
        // 处理当前状态的行为
        System.out.println("current : A");
        work.setHour("12");
    }

    @Override
    protected void changeState(Work work) {
        // 变更work对象的状态
        work.setState(new ConcreteStateB());
    }
}
