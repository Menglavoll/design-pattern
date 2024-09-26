package com.timeless.menglavol.design.pattern.bridge.implementor;

/**
 * @ClassName: ConcreteImplementorA
 * @Description: 具体的实现类A
 * @Author: timeless
 * @Date: 2024/9/14
 */
public class ConcreteImplementorA extends AbstractImplementor {

    // 将抽象方法具像化
    @Override
    public void operation() {
        System.out.println("ConcreteImplementorA.operation");
    }
}
