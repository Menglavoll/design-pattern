package com.timeless.menglavol.design.pattern.iterator.iterator;

import com.timeless.menglavol.design.pattern.iterator.aggregate.ConcreteAggregate;

/**
 * @ClassName: ConcreteIterator
 * @Description: 具体的迭代器
 * @Author: timeless
 * @Date: 2024/9/13
 */
public class ConcreteIterator extends AbstractIterator {

    private ConcreteAggregate concreteAggregate;

    private int index;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return this.concreteAggregate.size() > 0 && index < concreteAggregate.size();
    }

    @Override
    public Object next() {
        Object result = null;
        if (hasNext()){
            result = this.concreteAggregate.get(index++);
        }
        return result;
    }

    @Override
    public boolean hasPrevious() {
        return this.concreteAggregate.size() > 0 && index >= 1;
    }

    @Override
    public Object previous() {
        Object result = null;
        if (hasPrevious()){
            result = this.concreteAggregate.get(--index);
        }
        return result;
    }
}
