package com.timeless.menglavol.design.pattern.visitor.element;

import com.timeless.menglavol.design.pattern.visitor.visitor.AbstractVisitor;

/**
 * @ClassName: ConcreteElementA
 * @Description: 具体元素B
 * @Author: timeless
 * @Date: 2024/9/18
 */
public class ConcreteElementB extends AbstractElement {

    public ConcreteElementB(String name) {
        super(name);
    }

    @Override
    public void accept(AbstractVisitor visitor) {
        visitor.visitElementB(this);
    }

    public void operationB(){
        
    }
}
