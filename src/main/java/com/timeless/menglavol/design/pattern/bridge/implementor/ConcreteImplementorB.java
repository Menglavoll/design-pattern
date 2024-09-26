package com.timeless.menglavol.design.pattern.bridge.implementor;

/**
 * @ClassName: ConcreteImplementorB
 * @Description: 具体的实现类B
 * @Author: timeless
 * @Date: 2024/9/14
 */
public class ConcreteImplementorB extends AbstractImplementor {

    @Override
    public void operation() {
        System.out.println("ConcreteImplementorB.operation");
    }
}
