package com.timeless.menglavol.design.pattern.flyweight.factory;

import com.timeless.menglavol.design.pattern.flyweight.flyweight.AbstractFlyweight;
import com.timeless.menglavol.design.pattern.flyweight.flyweight.ConcreteFlyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: FlyweightFactory
 * @Description: 享元工厂
 * @Author: timeless
 * @Date: 2024/9/17
 */
public class FlyweightFactory {

    private final Map<String, AbstractFlyweight> flyweights = new HashMap<>();

    // 获取享元对象
    // 创建享元可以在初始化工厂时创建；也可以在获取时创建
    public AbstractFlyweight getFlyweight(String name) {
        AbstractFlyweight abstractFlyweight = flyweights.get(name);
        if (abstractFlyweight == null) {
            abstractFlyweight = new ConcreteFlyweight(name);
            flyweights.put(name, abstractFlyweight);
        }
        return abstractFlyweight;
    }
}
