package com.timeless.menglavol.design.pattern.mediator.client;

import com.timeless.menglavol.design.pattern.mediator.colleague.AbstractColleague;
import com.timeless.menglavol.design.pattern.mediator.colleague.ConcreteColleagueA;
import com.timeless.menglavol.design.pattern.mediator.colleague.ConcreteColleagueB;
import com.timeless.menglavol.design.pattern.mediator.mediator.ConcreteMediator;

/**
 * @ClassName: Client
 * @Description: 客户端类
 * @Author: timeless
 * @Date: 2024/9/15
 */
public class Client {

    public static void main(String[] args) {
        // 创建中介者
        ConcreteMediator mediator = new ConcreteMediator();

        // 创建两位同事
        AbstractColleague colleagueA = new ConcreteColleagueA("A", mediator);
        AbstractColleague colleagueB = new ConcreteColleagueB("B", mediator);

        // 向中介者中添加两位同事
        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);

        colleagueA.send("你的活干完了吗？");
        colleagueB.send("没有呢！");
        colleagueA.send("你的活干完了吗？");
        colleagueB.send("弄完了！");
        colleagueA.send("出去打球去吗？");
        colleagueB.send("走！");
    }
}
