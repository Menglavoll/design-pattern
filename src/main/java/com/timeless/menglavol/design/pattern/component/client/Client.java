package com.timeless.menglavol.design.pattern.component.client;

import com.timeless.menglavol.design.pattern.component.component.Component;
import com.timeless.menglavol.design.pattern.component.composite.Composite;
import com.timeless.menglavol.design.pattern.component.left.Left;

/**
 * @ClassName: Client
 * @Description: 客户端
 * @Author: timeless
 * @Date: 2024/9/13
 */
public class Client {

    public static void main(String[] args) {

        // top层
        Component top = new Composite("Top");

        // 第一层
        Component firstLeft1 = new Left("FirstLeft1");
        top.add(firstLeft1);
        Component firstLeft2 = new Left("FirstLeft2");
        top.add(firstLeft2);
        Component first = new Composite("First");
        top.add(first);

        // 第二层
        Component secondLeft1 = new Left("SecondLeft1");
        first.add(secondLeft1);
        Component secondLeft2 = new Left("SecondLeft2");
        first.add(secondLeft2);
        Component second = new Composite("Second");
        first.add(second);

        // 第三层
        Component thirdLeft1 = new Left("ThirdLeft1");
        second.add(thirdLeft1);
        Component thirdLeft2 = new Left("ThirdLeft2");
        second.add(thirdLeft2);

        // 显示树结构
        top.display(0);
    }
}
