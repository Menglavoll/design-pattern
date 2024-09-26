package com.timeless.menglavol.design.pattern.flyweight.client;

import com.timeless.menglavol.design.pattern.flyweight.factory.FlyweightFactory;
import com.timeless.menglavol.design.pattern.flyweight.flyweight.AbstractFlyweight;
import com.timeless.menglavol.design.pattern.flyweight.flyweight.UnsharedConcreteFlyweight;

/**
 * @ClassName: Client
 * @Description: 客户端类
 * @Author: timeless
 * @Date: 2024/9/15
 */
public class Client {

    public static void main(String[] args) {
        // 创建外部状态
        int extrinsicState = 20;

        // 创建享元工厂
        FlyweightFactory factory = new FlyweightFactory();

        // 根据享元工厂获取享元对象
        AbstractFlyweight flyweightA = factory.getFlyweight("A");
        flyweightA.operation(extrinsicState--);

        // 根据享元工厂获取享元对象
        AbstractFlyweight flyweightB = factory.getFlyweight("B");
        flyweightB.operation(extrinsicState--);

        // 根据享元工厂获取享元对象
        AbstractFlyweight flyweightC = factory.getFlyweight("A");
        flyweightC.operation(extrinsicState--);

        // 获取不共享内部状态的对象
        AbstractFlyweight flyweightD = new UnsharedConcreteFlyweight("D");
        flyweightD.operation(extrinsicState);
    }
}
