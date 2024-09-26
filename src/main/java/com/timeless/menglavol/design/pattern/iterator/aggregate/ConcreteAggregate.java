package com.timeless.menglavol.design.pattern.iterator.aggregate;

import com.timeless.menglavol.design.pattern.iterator.iterator.AbstractIterator;
import com.timeless.menglavol.design.pattern.iterator.iterator.ConcreteIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ConcreteAggregate
 * @Description: 具体的聚合类
 * @Author: timeless
 * @Date: 2024/9/13
 */
public class ConcreteAggregate extends AbstractAggregate {

    private List<String> items = new ArrayList<>();

    // 创建自己需要使用的迭代器
    @Override
    public AbstractIterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int size(){
        return items.size();
    }

    public void add(String item){
        items.add(item);
    }

    public String get(int index){
        return items.get(index);
    }
}
