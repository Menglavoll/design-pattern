package com.timeless.menglavol.design.pattern.memento.client;

import com.timeless.menglavol.design.pattern.memento.caretaker.Caretaker;
import com.timeless.menglavol.design.pattern.memento.memento.Memento;
import com.timeless.menglavol.design.pattern.memento.originator.Originator;

/**
 * @ClassName: Client
 * @Description: 客户端
 * @Author: timeless
 * @Date: 2024/9/12
 */
public class Client {

    public static void main(String[] args) {
        // 创建备忘录发起类
        Originator originator = new Originator();
        // 设置初始状态
        originator.setState("first state.");
        // 显示当前状态
        originator.show();

        // 为Originator对象的当前状态创建备忘录
        Memento memento = originator.createMemento();
        // 创建备忘录管理对象
        Caretaker caretaker = new Caretaker();
        // 将上面创建好的备忘录存放到管理对象中
        caretaker.setMemento(memento);

        // 更新备忘录发起类的状态
        originator.setState("second state.");
        // 显示当前状态
        originator.show();

        // 恢复备忘录里的状态
        originator.restoreMemento(caretaker.getMemento());
        // 显示恢复之后的状态
        originator.show();
    }
}
