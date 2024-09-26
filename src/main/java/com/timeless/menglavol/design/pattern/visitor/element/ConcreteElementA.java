package com.timeless.menglavol.design.pattern.visitor.element;

import com.timeless.menglavol.design.pattern.visitor.visitor.AbstractVisitor;

/**
 * @ClassName: ConcreteElementA
 * @Description: 具体元素A
 * @Author: timeless
 * @Date: 2024/9/18
 */
public class ConcreteElementA extends AbstractElement {

    public ConcreteElementA(String name) {
        super(name);
    }

    @Override
    public void accept(AbstractVisitor visitor) {
        visitor.visitElementA(this);
    }

    public void operationA(){

    }
}
