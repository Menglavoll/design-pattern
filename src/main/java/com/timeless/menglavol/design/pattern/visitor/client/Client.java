package com.timeless.menglavol.design.pattern.visitor.client;


import com.timeless.menglavol.design.pattern.visitor.structure.Structure;
import com.timeless.menglavol.design.pattern.visitor.visitor.ConcreteVisitorA;
import com.timeless.menglavol.design.pattern.visitor.visitor.ConcreteVisitorB;

/**
 * @ClassName: Client
 * @Description: 客户端类
 * @Author: timeless
 * @Date: 2024/9/15
 */
public class Client {

    public static void main(String[] args) {
        // 创建抽象元素的所有子类的对象列表结构
        Structure structure = new Structure();

        // 为所有结构添加不同的访问者
        structure.accept(new ConcreteVisitorA());
        structure.accept(new ConcreteVisitorB());
    }
}
