package com.timeless.menglavol.design.pattern.state.state;

import com.timeless.menglavol.design.pattern.state.work.Work;

/**
 * @ClassName: AbstractState
 * @Description: 抽象的状态类
 * @Author: timeless
 * @Date: 2024/9/12
 */
public abstract class AbstractState {

    // 结合模版方法模式
    // handle方法设定一个模版方法 该类的状态处理过程
    // 可是设置成为final 要求子类不能对该方法进行重写 来保证处理过程不变
    public void handle(Work work){
        // 处理当前状态的行为
        doSomething(work);
        // 变更work对象的状态
        changeState(work);
    }

    // 设置抽象的受保护方法处理当前状态的行为
    // 保证该方法不能在外部使用 使执行状态行为的必须走模版方法
    protected abstract void doSomething(Work work);

    // 为子类提供一个改变状态的方法
    protected abstract void changeState(Work work);
}
