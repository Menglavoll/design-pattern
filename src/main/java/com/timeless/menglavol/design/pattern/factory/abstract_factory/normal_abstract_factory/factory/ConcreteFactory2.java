package com.timeless.menglavol.design.pattern.factory.abstract_factory.normal_abstract_factory.factory;

import com.timeless.menglavol.design.pattern.factory.abstract_factory.normal_abstract_factory.product.AbstractProductA;
import com.timeless.menglavol.design.pattern.factory.abstract_factory.normal_abstract_factory.product.AbstractProductB;
import com.timeless.menglavol.design.pattern.factory.abstract_factory.normal_abstract_factory.product.ProductA2;
import com.timeless.menglavol.design.pattern.factory.abstract_factory.normal_abstract_factory.product.ProductB2;

/**
 * @ClassName: ConcreteFactory2
 * @Description: 具体工厂类2
 * @Author: timeless
 * @Date: 2024/9/11
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
