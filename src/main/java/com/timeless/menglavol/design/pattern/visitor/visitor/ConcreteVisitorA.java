package com.timeless.menglavol.design.pattern.visitor.visitor;

import com.timeless.menglavol.design.pattern.visitor.element.AbstractElement;

/**
 * @ClassName: ConcreteVisitor
 * @Description: 具体的访问者A
 * @Author: timeless
 * @Date: 2024/9/18
 */
public class ConcreteVisitorA extends AbstractVisitor {

    private final String NAME = "ConcreteVisitorA";

    @Override
    public void visitElementA(AbstractElement element) {
        System.out.println(NAME + "访问了" + element.getName() + "结果：胜利了");
    }

    @Override
    public void visitElementB(AbstractElement element) {
        System.out.println(NAME + "访问了" + element.getName() + "结果：失败了");
    }
}
