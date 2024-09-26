package com.timeless.menglavol.design.pattern.iterator.aggregate;

import com.timeless.menglavol.design.pattern.iterator.iterator.AbstractIterator;

/**
 * @ClassName: AbstractAggregate
 * @Description: 抽象的聚合类
 * @Author: timeless
 * @Date: 2024/9/13
 */
public abstract class AbstractAggregate {

    // 声明创建迭代器的抽象方法用于子类实现 方便子类关联其定制的迭代器
    public abstract AbstractIterator createIterator();
}
