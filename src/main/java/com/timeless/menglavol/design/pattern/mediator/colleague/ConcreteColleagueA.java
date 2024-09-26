package com.timeless.menglavol.design.pattern.mediator.colleague;

import com.timeless.menglavol.design.pattern.mediator.mediator.AbstractMediator;

/**
 * @ClassName: ConcreteColleagueA
 * @Description: 具体的同事A
 * @Author: timeless
 * @Date: 2024/9/16
 */
public class ConcreteColleagueA extends AbstractColleague{

    private String name;

    public ConcreteColleagueA(String name, AbstractMediator mediator) {
        super(mediator);
        this.name = name;
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + "接收到了：" + message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
