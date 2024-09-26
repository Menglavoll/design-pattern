package com.timeless.menglavol.design.pattern.command.client;

import com.timeless.menglavol.design.pattern.command.command.ConcreteCommandA;
import com.timeless.menglavol.design.pattern.command.command.ICommand;
import com.timeless.menglavol.design.pattern.command.invoker.Invoker;
import com.timeless.menglavol.design.pattern.command.receiver.Receiver;

/**
 * @ClassName: Client
 * @Description: 客户端
 * @Author: timeless
 * @Date: 2024/9/14
 */
public class Client {

    public static void main(String[] args) {

        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();
        ICommand command = new ConcreteCommandA(receiver);
        invoker.add(command);
        invoker.execute();
    }
}
