package com.timeless.menglavol.design.pattern.bridge.abstraction;

import com.timeless.menglavol.design.pattern.bridge.implementor.AbstractImplementor;

/**
 * @ClassName: Abstraction
 * @Description: 桥接模式的抽象部分
 * @Author: timeless
 * @Date: 2024/9/14
 */
public abstract class Abstraction {

    // 定一个该抽象类的实现对象
    protected AbstractImplementor implementor;

    // 要求初始化时确定该抽象的具体实现
    public Abstraction(AbstractImplementor implementor) {
        this.implementor = implementor;
    }

    // 定义抽象方法 便于子类调用该抽象具体实现的方法
    public abstract void operation();
}
