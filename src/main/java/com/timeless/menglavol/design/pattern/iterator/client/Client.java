package com.timeless.menglavol.design.pattern.iterator.client;

import com.timeless.menglavol.design.pattern.iterator.aggregate.ConcreteAggregate;
import com.timeless.menglavol.design.pattern.iterator.iterator.AbstractIterator;

/**
 * @ClassName: Client
 * @Description: 客户端
 * @Author: timeless
 * @Date: 2024/9/13
 */
public class Client {

    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.add("1");
        aggregate.add("2");
        aggregate.add("3");
        aggregate.add("4");
        aggregate.add("5");

        AbstractIterator iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("==================");

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        System.out.println("==================");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
