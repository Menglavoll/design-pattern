package com.timeless.menglavol.design.pattern.mediator.mediator;

import com.timeless.menglavol.design.pattern.mediator.colleague.AbstractColleague;

/**
 * @ClassName: ConcreteMediator
 * @Description: 具体的中介者
 * @Author: timeless
 * @Date: 2024/9/16
 */
public class ConcreteMediator extends AbstractMediator {

    private AbstractColleague colleagueA;

    private AbstractColleague colleagueB;

    public AbstractColleague getColleagueA() {
        return colleagueA;
    }

    public void setColleagueA(AbstractColleague colleagueA) {
        this.colleagueA = colleagueA;
    }

    public AbstractColleague getColleagueB() {
        return colleagueB;
    }

    public void setColleagueB(AbstractColleague colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void send(String message, AbstractColleague colleague) {
        if (colleague == colleagueA) {
            colleagueB.receive(message);
        } else {
            colleagueA.receive(message);
        }
    }
}
