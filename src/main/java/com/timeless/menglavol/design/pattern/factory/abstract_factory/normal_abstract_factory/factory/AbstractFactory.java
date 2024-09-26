package com.timeless.menglavol.design.pattern.factory.abstract_factory.normal_abstract_factory.factory;

import com.timeless.menglavol.design.pattern.factory.abstract_factory.normal_abstract_factory.product.AbstractProductA;
import com.timeless.menglavol.design.pattern.factory.abstract_factory.normal_abstract_factory.product.AbstractProductB;

/**
 * @ClassName: AbstractFactory
 * @Description: 抽象工厂的抽象类
 * @Author: timeless
 * @Date: 2024/9/11
 */
public abstract class AbstractFactory {

    // 定义创建抽象产品A的方法
    public abstract AbstractProductA createProductA();

    // 定义抽象产品B的方法
    public abstract AbstractProductB createProductB();
}
