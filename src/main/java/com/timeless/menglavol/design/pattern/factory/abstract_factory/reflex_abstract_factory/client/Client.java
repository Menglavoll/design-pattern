package com.timeless.menglavol.design.pattern.factory.abstract_factory.reflex_abstract_factory.client;

import com.timeless.menglavol.design.pattern.factory.abstract_factory.reflex_abstract_factory.factory.ProductFactory;
import com.timeless.menglavol.design.pattern.factory.abstract_factory.reflex_abstract_factory.product.AbstractProductA;
import com.timeless.menglavol.design.pattern.factory.abstract_factory.reflex_abstract_factory.product.AbstractProductB;

/**
 * @ClassName: Client
 * @Description: 客户端
 * @Author: timeless
 * @Date: 2024/9/11
 */
public class Client {

    public static void main(String[] args) throws Exception {
        ProductFactory factory = new ProductFactory();
        factory.setNumber("1");

        factory.setProductType("A");
        AbstractProductA productA1 = factory.createProductA();
        factory.setProductType("B");
        AbstractProductB productB1 = factory.createProductB();
        System.out.println("AbstractProductA:" + productA1.getType());
        System.out.println("AbstractProductB:" + productB1.getType());

        factory.setNumber("2");

        factory.setProductType("A");
        AbstractProductA productA2 = factory.createProductA();
        factory.setProductType("B");
        AbstractProductB productB2 = factory.createProductB();
        System.out.println("AbstractProductA:" + productA2.getType());
        System.out.println("AbstractProductB:" + productB2.getType());
    }
}
