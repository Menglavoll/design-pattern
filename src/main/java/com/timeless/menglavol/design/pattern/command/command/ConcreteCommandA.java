package com.timeless.menglavol.design.pattern.command.command;


import com.timeless.menglavol.design.pattern.command.receiver.Receiver;

/**
 * @ClassName: ConcreteCommandA
 * @Description: 具体命令A
 * @Author: timeless
 * @Date: 2024/9/14
 */
public class ConcreteCommandA implements ICommand{

    // 声明一个抽象的AbstractReceiver对象
    private Receiver receiver;

    // 初始化命令时需要制定执行命令的接收对象
    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    // 执行命令
    @Override
    public void execute() {
        receiver.action();
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }
}
