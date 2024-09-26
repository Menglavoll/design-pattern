package com.timeless.menglavol.design.pattern.flyweight.flyweight;

/**
 * @ClassName: AbstractFlyweight
 * @Description: 抽象的享元类
 * @Author: timeless
 * @Date: 2024/9/17
 */
public abstract class AbstractFlyweight {

    // 定义根据外部状态尽心操作的方法
    public abstract void operation(int extrinsicState);
}
