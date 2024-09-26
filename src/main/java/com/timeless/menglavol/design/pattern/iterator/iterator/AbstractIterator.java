package com.timeless.menglavol.design.pattern.iterator.iterator;

/**
 * @ClassName: AbstractIterator
 * @Description: 抽象的迭代器
 * @Author: timeless
 * @Date: 2024/9/13
 */
public abstract class AbstractIterator {

    // 判断是否存在下一个元素
    public abstract boolean hasNext();

    // 获取下一个元素
    public abstract Object next();

    // 判断是否存在上一个元素
    public abstract boolean hasPrevious();

    // 获取前一个元素
    public abstract Object previous();
}
