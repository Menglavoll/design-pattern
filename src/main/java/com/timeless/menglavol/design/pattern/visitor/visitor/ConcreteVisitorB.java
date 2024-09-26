package com.timeless.menglavol.design.pattern.visitor.visitor;

import com.timeless.menglavol.design.pattern.visitor.element.AbstractElement;

/**
 * @ClassName: ConcreteVisitor
 * @Description: 具体的访问者B
 * @Author: timeless
 * @Date: 2024/9/18
 */
public class ConcreteVisitorB extends AbstractVisitor {

    private final String NAME = "ConcreteVisitorB";

    @Override
    public void visitElementA(AbstractElement element) {
        System.out.println(NAME + "访问了" + element.getName() + "结果：失败了");
    }

    @Override
    public void visitElementB(AbstractElement element) {
        System.out.println(NAME + "访问了" + element.getName() + "结果：胜利了");
    }
}
