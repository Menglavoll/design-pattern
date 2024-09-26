package com.timeless.menglavol.design.pattern.factory.abstract_factory.normal_abstract_factory.client;

import com.timeless.menglavol.design.pattern.factory.abstract_factory.normal_abstract_factory.factory.AbstractFactory;
import com.timeless.menglavol.design.pattern.factory.abstract_factory.normal_abstract_factory.factory.ConcreteFactory1;
import com.timeless.menglavol.design.pattern.factory.abstract_factory.normal_abstract_factory.factory.ConcreteFactory2;
import com.timeless.menglavol.design.pattern.factory.abstract_factory.normal_abstract_factory.product.AbstractProductA;
import com.timeless.menglavol.design.pattern.factory.abstract_factory.normal_abstract_factory.product.AbstractProductB;

/**
 * @ClassName: Client
 * @Description: 客户端
 * @Author: timeless
 * @Date: 2024/9/11
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractProductA productA1 = factory1.createProductA();
        AbstractProductB productB1 = factory1.createProductB();

        System.out.println("AbstractProductA:" + productA1.getType());
        System.out.println("AbstractProductB:" + productB1.getType());

        AbstractFactory factory2 = new ConcreteFactory2();
        AbstractProductA productA2 = factory2.createProductA();
        AbstractProductB productB2 = factory2.createProductB();
        System.out.println("AbstractProductA:" + productA2.getType());
        System.out.println("AbstractProductB:" + productB2.getType());
    }
}
