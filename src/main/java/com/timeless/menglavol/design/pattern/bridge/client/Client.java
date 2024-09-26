package com.timeless.menglavol.design.pattern.bridge.client;

import com.timeless.menglavol.design.pattern.bridge.abstraction.Abstraction;
import com.timeless.menglavol.design.pattern.bridge.abstraction.RefineAbstraction;
import com.timeless.menglavol.design.pattern.bridge.implementor.ConcreteImplementorA;
import com.timeless.menglavol.design.pattern.bridge.implementor.ConcreteImplementorB;

/**
 * @ClassName: Client
 * @Description: 客户端
 * @Author: timeless
 * @Date: 2024/9/14
 */
public class Client {

    public static void main(String[] args) {

        Abstraction abstractionA = new RefineAbstraction(new ConcreteImplementorA());
        abstractionA.operation();

        Abstraction abstractionB = new RefineAbstraction(new ConcreteImplementorB());
        abstractionB.operation();
    }
}
