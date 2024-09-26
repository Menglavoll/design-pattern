package com.timeless.menglavol.design.pattern.factory.abstract_factory.normal_abstract_factory.factory;

import com.timeless.menglavol.design.pattern.factory.abstract_factory.normal_abstract_factory.product.AbstractProductA;
import com.timeless.menglavol.design.pattern.factory.abstract_factory.normal_abstract_factory.product.AbstractProductB;
import com.timeless.menglavol.design.pattern.factory.abstract_factory.normal_abstract_factory.product.ProductA1;
import com.timeless.menglavol.design.pattern.factory.abstract_factory.normal_abstract_factory.product.ProductB1;

/**
 * @ClassName: ConcreteFactory1
 * @Description: 具体工厂类1
 * @Author: timeless
 * @Date: 2024/9/11
 */
public class ConcreteFactory1 extends AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
