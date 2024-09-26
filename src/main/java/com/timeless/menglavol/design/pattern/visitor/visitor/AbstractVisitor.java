package com.timeless.menglavol.design.pattern.visitor.visitor;

import com.timeless.menglavol.design.pattern.visitor.element.AbstractElement;

/**
 * @ClassName: AbstractVisitor
 * @Description: 抽象的访问者
 * @Author: timeless
 * @Date: 2024/9/18
 */
public abstract class AbstractVisitor {

    // 访问元素A
    public abstract void visitElementA(AbstractElement element);

    // 访问元素B
    public abstract void visitElementB(AbstractElement element);
}
